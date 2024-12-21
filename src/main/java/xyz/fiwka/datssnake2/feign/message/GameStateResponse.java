package xyz.fiwka.datssnake2.feign.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import xyz.fiwka.datssnake2.feign.message.dto.EnemyDto;
import xyz.fiwka.datssnake2.feign.message.dto.FoodDto;
import xyz.fiwka.datssnake2.feign.message.dto.SnakeDto;
import xyz.fiwka.datssnake2.feign.message.dto.SpecialFoodDto;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Collections;
import java.util.List;

@Data
public class GameStateResponse {

    @Valid
    @JsonProperty("mapSize")
    private List<Integer> mapSize = Collections.emptyList();

    @NotEmpty
    @JsonProperty("name")
    private String name;

    @NotEmpty
    @JsonProperty("points")
    private int points;

    @Valid
    @JsonProperty("fences")
    private List<List<Integer>> fences = Collections.emptyList();

    @Valid
    @JsonProperty("snakes")
    private List<SnakeDto> snakes = Collections.emptyList();

    @Valid
    @JsonProperty("enemies")
    private List<EnemyDto> enemies = Collections.emptyList();

    @Valid
    @JsonProperty("food")
    private List<FoodDto> food = Collections.emptyList();

    @JsonProperty("specialFood")
    private SpecialFoodDto specialFood;

    @JsonProperty("turn")
    private int turn;

    @JsonProperty("reviveTimeoutSec")
    private int reviveTimeoutSec;

    @JsonProperty("tickRemainMs")
    private int tickRemainMs;

    @Valid
    @JsonProperty("errors")
    private List<String> errors = Collections.emptyList();

}
