package xyz.fiwka.datssnake2.sheduler;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import xyz.fiwka.datssnake2.feign.ClientSecret;
import xyz.fiwka.datssnake2.feign.DatsSnake2FeignClient;
import xyz.fiwka.datssnake2.feign.message.GameStateResponse;
import xyz.fiwka.datssnake2.feign.message.SnakesMoveRequest;
import xyz.fiwka.datssnake2.feign.message.dto.FoodDto;
import xyz.fiwka.datssnake2.feign.message.dto.SnakeDto;
import xyz.fiwka.datssnake2.model.Direction3D;
import xyz.fiwka.datssnake2.model.Point3D;
import xyz.fiwka.datssnake2.model.Snake;
import xyz.fiwka.datssnake2.model.SnakeAliveStatus;
import xyz.fiwka.datssnake2.transformer.SnakeTransformer;

import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class SnakeScheduler {

    private final DatsSnake2FeignClient datsSnake2FeignClient;
    private final ClientSecret clientSecret;

    @Scheduled(fixedRate = 1000)
    public void moveSnakeToNearestFood() {
        GameStateResponse gameState = datsSnake2FeignClient.getGameState(clientSecret.getSecret());

        gameStateLog(gameState);

        SnakesMoveRequest moveRequest = new SnakesMoveRequest();

        gameState.getSnakes().stream()
                .map(SnakeTransformer::toSnake)
                .filter(snake -> snake.getStatus() == SnakeAliveStatus.ALIVE)
                .filter(snake -> !snake.getGeometry().isEmpty())
                .forEach(snake -> {
                    Point3D nearestFood = findNearestFood(snake.getGeometry().getFirst(), gameState.getFood());
                    Direction3D direction3D = determineDirection3D(snake.getGeometry().getFirst(), nearestFood);
                    moveRequest.addMovableSnake(SnakeTransformer.toSnakeDto(snake), direction3D);
                });

        datsSnake2FeignClient.moveSnake(moveRequest, clientSecret.getSecret());
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
            return dx > 0 ? Direction3D.Cords.X.positive() : Direction3D.Cords.X.negative();
        } else if (Math.abs(dy) >= Math.abs(dx) && Math.abs(dy) >= Math.abs(dz)) {
            return dy > 0 ? Direction3D.Cords.Y.positive() : Direction3D.Cords.Y.negative();
        } else {
            return dz > 0 ? Direction3D.Cords.Z.positive() : Direction3D.Cords.Z.negative();
        }
    }

    private void gameStateLog(GameStateResponse gameStateResponse) {
        log.info(
                """
                
                Team name: {},
                Points team num: {},
                Team snakes: {}
                All snakes num: {}
                Alive snakes num: {}
                """,
                gameStateResponse.getName(),
                gameStateResponse.getPoints(),
                gameStateResponse.getSnakes(),
                gameStateResponse.getSnakes().size(),
                gameStateResponse.getSnakes().stream()
                        .filter(snake -> snake.getStatus() == SnakeAliveStatus.ALIVE)
                        .count()
        );
    }
}