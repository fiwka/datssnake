package xyz.fiwka.datssnake2.feign.message.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import xyz.fiwka.datssnake2.model.SnakeStatus;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Collections;
import java.util.List;

@Data
public class SnakeDto {

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
    private List<List<Integer>> geometry = Collections.emptyList();

    @JsonProperty("deathCount")
    private int deathCount;

    @JsonProperty("status")
    private SnakeStatus status;

    @JsonProperty("reviveRemainMs")
    private int reviveRemainMs;

}
