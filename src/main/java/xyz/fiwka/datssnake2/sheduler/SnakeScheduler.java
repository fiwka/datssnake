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
import xyz.fiwka.datssnake2.model.Point3D;
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
                Point3D nearestFood = findNearestFood(Point3D.fromList(snake.getGeometry().get(0)), gameState.getFood());
                Direction3D direction3D = determineDirection3D(Point3D.fromList(snake.getGeometry().get(0)), nearestFood);
                moveRequest.addMovableSnake(SnakeTransformer.toSnake(snake), direction3D);
            }
        }

        datsSnake2FeignClient.moveSnake(moveRequest, xAuthToken);
    }

    private Point3D findNearestFood(Point3D snakeHead, List<FoodDto> foodList) {
        Point3D nearestFood = null;
        int minDistance = Integer.MAX_VALUE;

        for (FoodDto food : foodList) {
            int distance = calculateDistance(snakeHead, Point3D.fromList(food.getC()));
            if (distance < minDistance) {
                minDistance = distance;
                nearestFood = Point3D.fromList(food.getC());
            }
        }

        return nearestFood;
    }

    private int calculateDistance(Point3D point1, Point3D point2) {
        return Math.abs(point1.x() - point2.x()) +
                Math.abs(point1.y() - point2.y()) +
                Math.abs(point1.z() - point2.z());
    }

    private Direction3D determineDirection3D(Point3D snakeHead, Point3D target) {
        int dx = target.x() - snakeHead.x();
        int dy = target.y() - snakeHead.y();
        int dz = target.z() - snakeHead.z();

        if (Math.abs(dx) >= Math.abs(dy) && Math.abs(dx) >= Math.abs(dz)) {
            return dx > 0 ? Direction3D.positiveXDirection() : Direction3D.negativeXDirection();
        } else if (Math.abs(dy) >= Math.abs(dx) && Math.abs(dy) >= Math.abs(dz)) {
            return dy > 0 ? Direction3D.positiveYDirection() : Direction3D.negativeYDirection();
        } else {
            return dz > 0 ? Direction3D.positiveZDirection() : Direction3D.negativeZDirection();
        }
    }
}