package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Snake
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-12-20T23:31:01.399014+05:00[Asia/Yekaterinburg]")

public class Snake {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("direction")
    @Valid
    private List<Integer> direction = null;

    @JsonProperty("oldDirection")
    @Valid
    private List<Integer> oldDirection = null;

    @JsonProperty("geometry")
    @Valid
    private List<Point3D> geometry = null;

    @JsonProperty("deathCount")
    private Integer deathCount = null;
    @JsonProperty("status")
    private StatusEnum status = null;
    @JsonProperty("reviveRemainMs")
    private Integer reviveRemainMs = null;

    public Snake id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique snake identifier
     *
     * @return id
     **/
    @ApiModelProperty(example = "db59f7bff43351d69b540c666fa8ff9f1c81f05c", value = "Unique snake identifier")


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Snake direction(List<Integer> direction) {
        this.direction = direction;
        return this;
    }

    public Snake addDirectionItem(Integer directionItem) {
        if (this.direction == null) {
            this.direction = new ArrayList<Integer>();
        }
        this.direction.add(directionItem);
        return this;
    }

    /**
     * Current direction vector [x, y, z]
     *
     * @return direction
     **/
    @ApiModelProperty(example = "[1,0,0]", value = "Current direction vector [x, y, z]")


    public List<Integer> getDirection() {
        return direction;
    }

    public void setDirection(List<Integer> direction) {
        this.direction = direction;
    }

    public Snake oldDirection(List<Integer> oldDirection) {
        this.oldDirection = oldDirection;
        return this;
    }

    public Snake addOldDirectionItem(Integer oldDirectionItem) {
        if (this.oldDirection == null) {
            this.oldDirection = new ArrayList<Integer>();
        }
        this.oldDirection.add(oldDirectionItem);
        return this;
    }

    /**
     * Previous direction vector [x, y, z]
     *
     * @return oldDirection
     **/
    @ApiModelProperty(example = "[0,0,-1]", value = "Previous direction vector [x, y, z]")


    public List<Integer> getOldDirection() {
        return oldDirection;
    }

    public void setOldDirection(List<Integer> oldDirection) {
        this.oldDirection = oldDirection;
    }

    public Snake geometry(List<Point3D> geometry) {
        this.geometry = geometry;
        return this;
    }

    public Snake addGeometryItem(Point3D geometryItem) {
        if (this.geometry == null) {
            this.geometry = new ArrayList<Point3D>();
        }
        this.geometry.add(geometryItem);
        return this;
    }

    /**
     * Snake body segments coordinates
     *
     * @return geometry
     **/
    @ApiModelProperty(value = "Snake body segments coordinates")

    @Valid

    public List<Point3D> getGeometry() {
        return geometry;
    }

    public void setGeometry(List<Point3D> geometry) {
        this.geometry = geometry;
    }

    public Snake deathCount(Integer deathCount) {
        this.deathCount = deathCount;
        return this;
    }

    /**
     * Number of times snake died
     *
     * @return deathCount
     **/
    @ApiModelProperty(example = "16", value = "Number of times snake died")


    public Integer getDeathCount() {
        return deathCount;
    }

    public void setDeathCount(Integer deathCount) {
        this.deathCount = deathCount;
    }

    public Snake status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Current snake status
     *
     * @return status
     **/
    @ApiModelProperty(example = "alive", value = "Current snake status")


    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Snake reviveRemainMs(Integer reviveRemainMs) {
        this.reviveRemainMs = reviveRemainMs;
        return this;
    }

    /**
     * Milliseconds remaining until revival if dead
     *
     * @return reviveRemainMs
     **/
    @ApiModelProperty(example = "0", value = "Milliseconds remaining until revival if dead")


    public Integer getReviveRemainMs() {
        return reviveRemainMs;
    }

    public void setReviveRemainMs(Integer reviveRemainMs) {
        this.reviveRemainMs = reviveRemainMs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Snake snake = (Snake) o;
        return Objects.equals(this.id, snake.id) &&
                Objects.equals(this.direction, snake.direction) &&
                Objects.equals(this.oldDirection, snake.oldDirection) &&
                Objects.equals(this.geometry, snake.geometry) &&
                Objects.equals(this.deathCount, snake.deathCount) &&
                Objects.equals(this.status, snake.status) &&
                Objects.equals(this.reviveRemainMs, snake.reviveRemainMs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, direction, oldDirection, geometry, deathCount, status, reviveRemainMs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Snake {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    oldDirection: ").append(toIndentedString(oldDirection)).append("\n");
        sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
        sb.append("    deathCount: ").append(toIndentedString(deathCount)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reviveRemainMs: ").append(toIndentedString(reviveRemainMs)).append("\n");
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

    /**
     * Current snake status
     */
    public enum StatusEnum {
        ALIVE("alive"),

        DEAD("dead");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}

