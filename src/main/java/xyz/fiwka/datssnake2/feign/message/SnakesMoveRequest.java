package xyz.fiwka.datssnake2.feign.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import xyz.fiwka.datssnake2.model.Direction3D;
import xyz.fiwka.datssnake2.model.Snake;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Collections;
import java.util.List;

@Data
public class SnakesMoveRequest {

    @JsonProperty("snakes")
    private List<SnakeMoveRequest> movableSnakes = Collections.emptyList();

    public SnakeMoveRequest addMovableSnake(Snake snake, Direction3D direction3D) {
        return new SnakeMoveRequest(snake.getId(), direction3D.toList());
    }

    @AllArgsConstructor
    public static class SnakeMoveRequest {

        @NotEmpty
        @JsonProperty("id")
        private String id;

        @Valid
        @JsonProperty("direction")
        private List<Integer> direction = Collections.emptyList();

    }

}
