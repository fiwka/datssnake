package xyz.fiwka.datssnake2.transformer;

import xyz.fiwka.datssnake2.feign.message.dto.SnakeDto;
import xyz.fiwka.datssnake2.model.Direction3D;
import xyz.fiwka.datssnake2.model.Snake;
import xyz.fiwka.datssnake2.model.SnakeStatus;

import java.util.stream.Collectors;

public class SnakeTransformer {

    public static Snake toSnake(SnakeDto snakeDto) {
        Snake snake = new Snake(snakeDto.getId());
        snake.setDirection(new Direction3D(snakeDto.getDirection()));
        snake.setOldDirection(new Direction3D(snakeDto.getOldDirection()));
        snake.setDeathCount(snakeDto.getDeathCount());
        snake.setStatus(Snake.StatusEnum.fromValue(snakeDto.getStatus().toString()));
        snake.setReviveRemainMs(snakeDto.getReviveRemainMs());
        return snake;
    }

    public static SnakeDto toSnakeDto(Snake snake) {
        SnakeDto snakeDto = new SnakeDto();
        snakeDto.setId(snake.getId());
        snakeDto.setDirection(snake.getDirection().toList());
        snakeDto.setOldDirection(snake.getOldDirection().toList());
        snakeDto.setDeathCount(snake.getDeathCount());
        snakeDto.setReviveRemainMs(snake.getReviveRemainMs());
        return snakeDto;
    }
}