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
 * Enemy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-12-20T23:31:01.399014+05:00[Asia/Yekaterinburg]")

public class Enemy {
    @JsonProperty("geometry")
    @Valid
    private List<Point3D> geometry = null;
    @JsonProperty("status")
    private StatusEnum status = null;
    @JsonProperty("kills")
    private Integer kills = null;

    public Enemy geometry(List<Point3D> geometry) {
        this.geometry = geometry;
        return this;
    }

    public Enemy addGeometryItem(Point3D geometryItem) {
        if (this.geometry == null) {
            this.geometry = new ArrayList<Point3D>();
        }
        this.geometry.add(geometryItem);
        return this;
    }

    /**
     * Enemy body segments coordinates
     *
     * @return geometry
     **/
    @ApiModelProperty(value = "Enemy body segments coordinates")

    @Valid

    public List<Point3D> getGeometry() {
        return geometry;
    }

    public void setGeometry(List<Point3D> geometry) {
        this.geometry = geometry;
    }

    public Enemy status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @ApiModelProperty(example = "alive", value = "")


    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Enemy kills(Integer kills) {
        this.kills = kills;
        return this;
    }

    /**
     * Number of kills by this enemy
     *
     * @return kills
     **/
    @ApiModelProperty(example = "0", value = "Number of kills by this enemy")


    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Enemy enemy = (Enemy) o;
        return Objects.equals(this.geometry, enemy.geometry) &&
                Objects.equals(this.status, enemy.status) &&
                Objects.equals(this.kills, enemy.kills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(geometry, status, kills);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Enemy {\n");

        sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
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
     * Gets or Sets status
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

