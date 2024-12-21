package xyz.fiwka.datssnake2.feign.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import xyz.fiwka.datssnake2.feign.message.dto.SnakeDto;
import xyz.fiwka.datssnake2.model.Direction3D;
import xyz.fiwka.datssnake2.model.Snake;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Data
public class SnakesMoveRequest {

    @JsonProperty("snakes")
    private List<SnakeMoveRequest> movableSnakes = new ArrayList<>();

    public SnakeMoveRequest addMovableSnake(SnakeDto snake, Direction3D direction3D) {
        SnakeMoveRequest snakeMoveRequest = new SnakeMoveRequest(snake.getId(), direction3D.toList());
        this.movableSnakes.add(snakeMoveRequest);
        return snakeMoveRequest;
    }

    @Data
    @AllArgsConstructor
    public static class SnakeMoveRequest {

        @NotEmpty
        @JsonProperty("id")
        private String id;

        @Valid
        @JsonProperty("direction")
        private List<Integer> direction;

    }

}
