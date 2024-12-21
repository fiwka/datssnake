package xyz.fiwka.datssnake2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import xyz.fiwka.datssnake2.feign.message.SnakesMoveRequest;
import xyz.fiwka.datssnake2.model.GameState;

@FeignClient("dats-snake-2-client")
public interface DatsSnake2FeignClient {

    @PostMapping("play/snake3d/player/move/")
    GameState getGameState();

    @PostMapping("play/snake3d/player/move/")
    GameState moveSnake(SnakesMoveRequest snakesMove);
}