package xyz.fiwka.datssnake2.feign.message.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import xyz.fiwka.datssnake2.model.SnakeStatus;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@Data
public class EnemyDto {

    @Valid
    @JsonProperty("geometry")
    private List<List<Integer>> geometry = Collections.emptyList();

    @JsonProperty("status")
    private SnakeStatus status;

    @JsonProperty("kills")
    private Integer kills;

}
