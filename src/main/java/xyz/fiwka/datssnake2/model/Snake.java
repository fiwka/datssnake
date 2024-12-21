package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
public class Snake {

    @NotEmpty
    @JsonProperty("id")
    private String id;

    @Valid
    @JsonProperty("direction")
    private List<Integer> direction = Collections.emptyList();

    @Valid
    @JsonProperty("oldDirection")
    private List<Integer> oldDirection = Collections.emptyList();

    @Valid
    @JsonProperty("geometry")
    private List<Point3D> geometry = Collections.emptyList();

    @JsonProperty("deathCount")
    private int deathCount;

    @JsonProperty("status")
    private StatusEnum status;

    @JsonProperty("reviveRemainMs")
    private int reviveRemainMs;

    public Snake(String id) {
        this.id = id;
    }

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

