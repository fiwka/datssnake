package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * Food
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-12-20T23:31:01.399014+05:00[Asia/Yekaterinburg]")

public class Food {
    @JsonProperty("c")
    private Point3D c = null;

    @JsonProperty("points")
    private Integer points = null;

    public Food c(Point3D c) {
        this.c = c;
        return this;
    }

    /**
     * Get c
     *
     * @return c
     **/
    @ApiModelProperty(value = "")

    @Valid

    public Point3D getC() {
        return c;
    }

    public void setC(Point3D c) {
        this.c = c;
    }

    public Food points(Integer points) {
        this.points = points;
        return this;
    }

    /**
     * Points value of this food
     *
     * @return points
     **/
    @ApiModelProperty(example = "6", value = "Points value of this food")


    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Food food = (Food) o;
        return Objects.equals(this.c, food.c) &&
                Objects.equals(this.points, food.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(c, points);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Food {\n");

        sb.append("    c: ").append(toIndentedString(c)).append("\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

