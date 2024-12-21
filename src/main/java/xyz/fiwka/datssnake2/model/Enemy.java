package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@Data
public class Enemy {

    @Valid
    @JsonProperty("geometry")
    private List<Point3D> geometry = Collections.emptyList();

    @JsonProperty("status")
    private SnakeAliveStatus status;

    @JsonProperty("kills")
    private Integer kills;

}

