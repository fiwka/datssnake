package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GameState
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-12-20T23:31:01.399014+05:00[Asia/Yekaterinburg]")

public class GameState {
    @JsonProperty("mapSize")
    @Valid
    private List<Integer> mapSize = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("points")
    private Integer points = null;

    @JsonProperty("fences")
    @Valid
    private List<Point3D> fences = null;

    @JsonProperty("snakes")
    @Valid
    private List<Snake> snakes = null;

    @JsonProperty("enemies")
    @Valid
    private List<Enemy> enemies = null;

    @JsonProperty("food")
    @Valid
    private List<Food> food = null;

    @JsonProperty("specialFood")
    private SpecialFood specialFood = null;

    @JsonProperty("turn")
    private Integer turn = null;

    @JsonProperty("reviveTimeoutSec")
    private Integer reviveTimeoutSec = null;

    @JsonProperty("tickRemainMs")
    private Integer tickRemainMs = null;

    @JsonProperty("errors")
    @Valid
    private List<String> errors = null;

    public GameState mapSize(List<Integer> mapSize) {
        this.mapSize = mapSize;
        return this;
    }

    public GameState addMapSizeItem(Integer mapSizeItem) {
        if (this.mapSize == null) {
            this.mapSize = new ArrayList<Integer>();
        }
        this.mapSize.add(mapSizeItem);
        return this;
    }

    /**
     * Map dimensions [width, height, depth]
     *
     * @return mapSize
     **/
    @ApiModelProperty(example = "[180,180,30]", value = "Map dimensions [width, height, depth]")


    public List<Integer> getMapSize() {
        return mapSize;
    }

    public void setMapSize(List<Integer> mapSize) {
        this.mapSize = mapSize;
    }

    public GameState name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Game instance name
     *
     * @return name
     **/
    @ApiModelProperty(example = "CleanCrib envious", value = "Game instance name")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameState points(Integer points) {
        this.points = points;
        return this;
    }

    /**
     * Current score
     *
     * @return points
     **/
    @ApiModelProperty(example = "275", value = "Current score")


    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public GameState fences(List<Point3D> fences) {
        this.fences = fences;
        return this;
    }

    public GameState addFencesItem(Point3D fencesItem) {
        if (this.fences == null) {
            this.fences = new ArrayList<Point3D>();
        }
        this.fences.add(fencesItem);
        return this;
    }

    /**
     * Array of fence coordinates
     *
     * @return fences
     **/
    @ApiModelProperty(value = "Array of fence coordinates")

    @Valid

    public List<Point3D> getFences() {
        return fences;
    }

    public void setFences(List<Point3D> fences) {
        this.fences = fences;
    }

    public GameState snakes(List<Snake> snakes) {
        this.snakes = snakes;
        return this;
    }

    public GameState addSnakesItem(Snake snakesItem) {
        if (this.snakes == null) {
            this.snakes = new ArrayList<Snake>();
        }
        this.snakes.add(snakesItem);
        return this;
    }

    /**
     * Array of snakes in the game
     *
     * @return snakes
     **/
    @ApiModelProperty(value = "Array of snakes in the game")

    @Valid

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public GameState enemies(List<Enemy> enemies) {
        this.enemies = enemies;
        return this;
    }

    public GameState addEnemiesItem(Enemy enemiesItem) {
        if (this.enemies == null) {
            this.enemies = new ArrayList<Enemy>();
        }
        this.enemies.add(enemiesItem);
        return this;
    }

    /**
     * Array of enemies in the game
     *
     * @return enemies
     **/
    @ApiModelProperty(value = "Array of enemies in the game")

    @Valid

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public GameState food(List<Food> food) {
        this.food = food;
        return this;
    }

    public GameState addFoodItem(Food foodItem) {
        if (this.food == null) {
            this.food = new ArrayList<Food>();
        }
        this.food.add(foodItem);
        return this;
    }

    /**
     * Array of regular food items
     *
     * @return food
     **/
    @ApiModelProperty(value = "Array of regular food items")

    @Valid

    public List<Food> getFood() {
        return food;
    }

    public void setFood(List<Food> food) {
        this.food = food;
    }

    public GameState specialFood(SpecialFood specialFood) {
        this.specialFood = specialFood;
        return this;
    }

    /**
     * Get specialFood
     *
     * @return specialFood
     **/
    @ApiModelProperty(value = "")

    @Valid

    public SpecialFood getSpecialFood() {
        return specialFood;
    }

    public void setSpecialFood(SpecialFood specialFood) {
        this.specialFood = specialFood;
    }

    public GameState turn(Integer turn) {
        this.turn = turn;
        return this;
    }

    /**
     * Current game turn number
     *
     * @return turn
     **/
    @ApiModelProperty(example = "1548", value = "Current game turn number")


    public Integer getTurn() {
        return turn;
    }

    public void setTurn(Integer turn) {
        this.turn = turn;
    }

    public GameState reviveTimeoutSec(Integer reviveTimeoutSec) {
        this.reviveTimeoutSec = reviveTimeoutSec;
        return this;
    }

    /**
     * Seconds until snake revival
     *
     * @return reviveTimeoutSec
     **/
    @ApiModelProperty(example = "5", value = "Seconds until snake revival")


    public Integer getReviveTimeoutSec() {
        return reviveTimeoutSec;
    }

    public void setReviveTimeoutSec(Integer reviveTimeoutSec) {
        this.reviveTimeoutSec = reviveTimeoutSec;
    }

    public GameState tickRemainMs(Integer tickRemainMs) {
        this.tickRemainMs = tickRemainMs;
        return this;
    }

    /**
     * Milliseconds remaining in current turn
     *
     * @return tickRemainMs
     **/
    @ApiModelProperty(example = "60", value = "Milliseconds remaining in current turn")


    public Integer getTickRemainMs() {
        return tickRemainMs;
    }

    public void setTickRemainMs(Integer tickRemainMs) {
        this.tickRemainMs = tickRemainMs;
    }

    public GameState errors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    public GameState addErrorsItem(String errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<String>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Array of error messages if any
     *
     * @return errors
     **/
    @ApiModelProperty(example = "[]", value = "Array of error messages if any")


    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GameState gameState = (GameState) o;
        return Objects.equals(this.mapSize, gameState.mapSize) &&
                Objects.equals(this.name, gameState.name) &&
                Objects.equals(this.points, gameState.points) &&
                Objects.equals(this.fences, gameState.fences) &&
                Objects.equals(this.snakes, gameState.snakes) &&
                Objects.equals(this.enemies, gameState.enemies) &&
                Objects.equals(this.food, gameState.food) &&
                Objects.equals(this.specialFood, gameState.specialFood) &&
                Objects.equals(this.turn, gameState.turn) &&
                Objects.equals(this.reviveTimeoutSec, gameState.reviveTimeoutSec) &&
                Objects.equals(this.tickRemainMs, gameState.tickRemainMs) &&
                Objects.equals(this.errors, gameState.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapSize, name, points, fences, snakes, enemies, food, specialFood, turn, reviveTimeoutSec, tickRemainMs, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GameState {\n");

        sb.append("    mapSize: ").append(toIndentedString(mapSize)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
        sb.append("    fences: ").append(toIndentedString(fences)).append("\n");
        sb.append("    snakes: ").append(toIndentedString(snakes)).append("\n");
        sb.append("    enemies: ").append(toIndentedString(enemies)).append("\n");
        sb.append("    food: ").append(toIndentedString(food)).append("\n");
        sb.append("    specialFood: ").append(toIndentedString(specialFood)).append("\n");
        sb.append("    turn: ").append(toIndentedString(turn)).append("\n");
        sb.append("    reviveTimeoutSec: ").append(toIndentedString(reviveTimeoutSec)).append("\n");
        sb.append("    tickRemainMs: ").append(toIndentedString(tickRemainMs)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

