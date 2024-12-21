package xyz.fiwka.datssnake2.sheduler;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import xyz.fiwka.datssnake2.feign.DatsSnake2FeignClient;
import xyz.fiwka.datssnake2.feign.message.GameStateResponse;
import xyz.fiwka.datssnake2.feign.message.SnakesMoveRequest;
import xyz.fiwka.datssnake2.feign.message.dto.FoodDto;
import xyz.fiwka.datssnake2.feign.message.dto.SnakeDto;
import xyz.fiwka.datssnake2.model.Direction3D;
import xyz.fiwka.datssnake2.transformer.SnakeTransformer;

import java.util.List;


@Service
public class SnakeScheduler {

    private final DatsSnake2FeignClient datsSnake2FeignClient;
    private final String xAuthToken;

    private final List<String> mySnakeIds;

    public SnakeScheduler(DatsSnake2FeignClient datsSnake2FeignClient, @Value("${x-auth-token}") String xAuthToken, List<String> mySnakeIds) {
        this.datsSnake2FeignClient = datsSnake2FeignClient;
        this.xAuthToken = xAuthToken;
        this.mySnakeIds = mySnakeIds;
    }

    @Scheduled(fixedRate = 1000)
    public void moveSnakeToNearestFood() {

        GameStateResponse gameState = datsSnake2FeignClient.getGameState(xAuthToken);


        SnakesMoveRequest moveRequest = new SnakesMoveRequest();

        for (SnakeDto snake : gameState.getSnakes()) {
            if (mySnakeIds.contains(snake.getId()) && "alive".equals(snake.getStatus().toString())) {
                List<Integer> nearestFood = findNearestFood(snake.getGeometry().get(0), gameState.getFood());
                Direction3D direction3D = determineDirection3D(snake.getGeometry().get(0), nearestFood);
                moveRequest.addMovableSnake(SnakeTransformer.toSnake(snake), direction3D);
            }
        }

        datsSnake2FeignClient.moveSnake(moveRequest, xAuthToken);
    }

    private List<Integer> findNearestFood(List<Integer> snakeHead, List<FoodDto> foodList) {
        List<Integer> nearestFood = null;
        double minDistance = Double.MAX_VALUE;

        for (FoodDto food : foodList) {
            double distance = calculateDistance(snakeHead, food.getC());
            if (distance < minDistance) {
                minDistance = distance;
                nearestFood = food.getC();
            }
        }

        return nearestFood;
    }

    private double calculateDistance(List<Integer> point1, List<Integer> point2) {
        return Math.sqrt(
                Math.pow(point1.get(0) - point2.get(0), 2) +
                        Math.pow(point1.get(1) - point2.get(1), 2) +
                        Math.pow(point1.get(2) - point2.get(2), 2)
        );
    }

    private Direction3D determineDirection3D(List<Integer> snakeHead, List<Integer> target) {
        int dx = target.get(0) - snakeHead.get(0);
        int dy = target.get(1) - snakeHead.get(1);
        int dz = target.get(2) - snakeHead.get(2);

        if (Math.abs(dx) >= Math.abs(dy) && Math.abs(dx) >= Math.abs(dz)) {
            return dx > 0 ? Direction3D.positiveXDirection() : Direction3D.negativeXDirection();
        } else if (Math.abs(dy) >= Math.abs(dx) && Math.abs(dy) >= Math.abs(dz)) {
            return dy > 0 ? Direction3D.positiveYDirection() : Direction3D.negativeYDirection();
        } else {
            return dz > 0 ? Direction3D.positiveZDirection() : Direction3D.negativeZDirection();
        }
    }
}