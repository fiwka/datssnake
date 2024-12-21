package xyz.fiwka.datssnake2;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import xyz.fiwka.datssnake2.feign.DatsSnake2FeignClient;
import xyz.fiwka.datssnake2.feign.message.GameStateResponse;
import xyz.fiwka.datssnake2.model.SnakeAliveStatus;


/**
 * Для тестов, но без тестов
 *
 * TODO если надо - удалить
 */

@Component
@RequiredArgsConstructor
public class Test implements ApplicationRunner {

    private final DatsSnake2FeignClient datsSnake2FeignClient;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        //List<SnakeDto> snakes = datsSnake2FeignClient.getGameState("ccf5f1fe-e82f-46c5-b592-e240d66ab2aa").getSnakes();
        //SnakesMoveRequest snakesMoveRequest = new SnakesMoveRequest();
        //snakes.forEach(snake -> snakesMoveRequest.addMovableSnake(new Snake(snake.getId()), Direction3D.positiveXDirection()));
        //datsSnake2FeignClient.moveSnake(snakesMoveRequest, "ccf5f1fe-e82f-46c5-b592-e240d66ab2aa");

        //Thread.sleep(4000);

        //System.out.println(datsSnake2FeignClient.getGameState("ccf5f1fe-e82f-46c5-b592-e240d66ab2aa").getSnakes());

        GameStateResponse gameStateResponse = datsSnake2FeignClient.getGameState("ccf5f1fe-e82f-46c5-b592-e240d66ab2aa");
        System.out.println(gameStateResponse.getPoints());
        System.out.println(gameStateResponse.getSnakes().stream().filter(snake -> snake.getStatus() == SnakeAliveStatus.ALIVE).toList());

    }
}
