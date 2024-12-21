package xyz.fiwka.datssnake2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fiwka.datssnake2.feign.DatsSnake2FeignClient;
import xyz.fiwka.datssnake2.feign.message.GameStateResponse;
import xyz.fiwka.datssnake2.feign.message.SnakesMoveRequest;

/**
       Получение текущего состояния игры
 */
@Service
public class GameService {
    @Autowired
    private DatsSnake2FeignClient datsSnake2FeignClient;

    public GameStateResponse getCurrentGameState(String xAuthToken) {
        return datsSnake2FeignClient.getGameState(xAuthToken);
    }

    public void moveSnake(SnakesMoveRequest snakesMove, String xAuthToken) {
        datsSnake2FeignClient.moveSnake(snakesMove, xAuthToken);
    }
}
