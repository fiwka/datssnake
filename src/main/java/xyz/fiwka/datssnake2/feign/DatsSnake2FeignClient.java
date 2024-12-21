package xyz.fiwka.datssnake2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import xyz.fiwka.datssnake2.feign.message.GameStateResponse;
import xyz.fiwka.datssnake2.feign.message.SnakesMoveRequest;

@Component
@FeignClient("dats-snake-2-client")
public interface DatsSnake2FeignClient {

    @PostMapping("play/snake3d/player/move")
    GameStateResponse getGameState(@RequestHeader("X-Auth-Token") String xAuthToken);

    @PostMapping("play/snake3d/player/move")
    GameStateResponse moveSnake(SnakesMoveRequest snakesMove, @RequestHeader("X-Auth-Token") String xAuthToken);

}