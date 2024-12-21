package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Data
@Validated
public class GameState {

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
    private List<Point3D> fences = Collections.emptyList();

    @Valid
    @JsonProperty("snakes")
    private List<Snake> snakes = Collections.emptyList();

    @Valid
    @JsonProperty("enemies")
    private List<Enemy> enemies = Collections.emptyList();

    @Valid
    @JsonProperty("food")
    private List<Food> food = Collections.emptyList();

    @JsonProperty("specialFood")
    private SpecialFood specialFood;

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