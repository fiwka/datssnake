package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * SnakeRequestSnakes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-12-20T23:31:01.399014+05:00[Asia/Yekaterinburg]")

public class SnakeRequestSnakes {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("direction")
    private Direction3D direction = null;

    public SnakeRequestSnakes id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique snake identifier
     *
     * @return id
     **/
    @ApiModelProperty(example = "6c1dfac6d106e6f4d0ffdddb665238253574ac1f", value = "Unique snake identifier")


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SnakeRequestSnakes direction(Direction3D direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get direction
     *
     * @return direction
     **/
    @ApiModelProperty(value = "")

    @Valid

    public Direction3D getDirection() {
        return direction;
    }

    public void setDirection(Direction3D direction) {
        this.direction = direction;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnakeRequestSnakes snakeRequestSnakes = (SnakeRequestSnakes) o;
        return Objects.equals(this.id, snakeRequestSnakes.id) &&
                Objects.equals(this.direction, snakeRequestSnakes.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, direction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnakeRequestSnakes {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

