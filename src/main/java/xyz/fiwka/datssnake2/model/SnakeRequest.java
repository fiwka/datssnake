package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SnakeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-12-20T23:31:01.399014+05:00[Asia/Yekaterinburg]")

public class SnakeRequest {
    @JsonProperty("snakes")
    @Valid
    private List<SnakeRequestSnakes> snakes = null;

    public SnakeRequest snakes(List<SnakeRequestSnakes> snakes) {
        this.snakes = snakes;
        return this;
    }

    public SnakeRequest addSnakesItem(SnakeRequestSnakes snakesItem) {
        if (this.snakes == null) {
            this.snakes = new ArrayList<SnakeRequestSnakes>();
        }
        this.snakes.add(snakesItem);
        return this;
    }

    /**
     * Get snakes
     *
     * @return snakes
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<SnakeRequestSnakes> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<SnakeRequestSnakes> snakes) {
        this.snakes = snakes;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnakeRequest snakeRequest = (SnakeRequest) o;
        return Objects.equals(this.snakes, snakeRequest.snakes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snakes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnakeRequest {\n");

        sb.append("    snakes: ").append(toIndentedString(snakes)).append("\n");
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

