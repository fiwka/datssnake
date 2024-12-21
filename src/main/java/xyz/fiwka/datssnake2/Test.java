package xyz.fiwka.datssnake2;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import xyz.fiwka.datssnake2.feign.DatsSnake2FeignClient;
import xyz.fiwka.datssnake2.feign.message.SnakesMoveRequest;
import xyz.fiwka.datssnake2.feign.message.dto.SnakeDto;
import xyz.fiwka.datssnake2.model.Direction3D;
import xyz.fiwka.datssnake2.model.Snake;

import java.util.List;

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
    }
}
