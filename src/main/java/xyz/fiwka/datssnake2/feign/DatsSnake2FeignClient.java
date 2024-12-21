package xyz.fiwka.datssnake2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import xyz.fiwka.datssnake2.feign.header.AccessTokenHeader;
import xyz.fiwka.datssnake2.feign.message.GameStateResponse;
import xyz.fiwka.datssnake2.feign.message.SnakesMoveRequest;

@FeignClient("dats-snake-2-client")
public interface DatsSnake2FeignClient {

    @PostMapping("play/snake3d/player/move")
    GameStateResponse getGameState(@RequestHeader AccessTokenHeader accessTokenHeader, @RequestHeader("X-Auth-Token") String xAuthToken);

    @PostMapping("play/snake3d/player/move")
    GameStateResponse moveSnake(SnakesMoveRequest snakesMove, @RequestHeader("X-Auth-Token") String xAuthToken);

}