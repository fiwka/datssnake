package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
public class Snake {

    @NotEmpty
    @JsonProperty("id")
    private String id;

    @Valid
    @JsonProperty("direction")
    private Direction3D direction;

    @Valid
    @JsonProperty("oldDirection")
    private Direction3D oldDirection;

    @Valid
    @JsonProperty("geometry")
    private List<Point3D> geometry = Collections.emptyList();

    @JsonProperty("deathCount")
    private int deathCount;

    @JsonProperty("status")
    private SnakeStatus status;

    @JsonProperty("reviveRemainMs")
    private int reviveRemainMs;

    public Snake(String id) {
        this.id = id;
    }

}

