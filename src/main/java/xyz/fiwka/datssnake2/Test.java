package xyz.fiwka.datssnake2;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import xyz.fiwka.datssnake2.feign.DatsSnake2FeignClient;
import xyz.fiwka.datssnake2.feign.message.SnakesMoveRequest;
import xyz.fiwka.datssnake2.model.Direction3D;
import xyz.fiwka.datssnake2.model.Snake;

import java.util.UUID;

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
        SnakesMoveRequest snakesMoveRequest = new SnakesMoveRequest();
        snakesMoveRequest.addMovableSnake(new Snake(UUID.randomUUID().toString()), Direction3D.positiveXDirection());
        System.out.println(datsSnake2FeignClient.moveSnake(snakesMoveRequest));
    }
}
