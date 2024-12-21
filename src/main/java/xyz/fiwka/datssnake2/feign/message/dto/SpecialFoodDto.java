package xyz.fiwka.datssnake2.feign.message.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@Data
public class SpecialFoodDto {

    @Valid
    @JsonProperty("golden")
    private List<List<Integer>> golden = Collections.emptyList();

    @Valid
    @JsonProperty("suspicious")
    private List<List<Integer>> suspicious = Collections.emptyList();

}
