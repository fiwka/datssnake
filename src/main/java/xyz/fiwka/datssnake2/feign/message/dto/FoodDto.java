package xyz.fiwka.datssnake2.feign.message.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class FoodDto {

    @JsonProperty("c")
    private List<Integer> c;

    @JsonProperty("points")
    private int points;

}
