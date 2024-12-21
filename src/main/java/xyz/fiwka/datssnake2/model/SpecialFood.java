package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Data
public class SpecialFood {

    @Valid
    @JsonProperty("golden")
    private List<Point3D> golden = Collections.emptyList();

    @Valid
    @JsonProperty("suspicious")
    private List<Point3D> suspicious = Collections.emptyList();

}