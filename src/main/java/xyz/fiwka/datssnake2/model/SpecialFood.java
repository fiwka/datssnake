package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SpecialFood
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-12-20T23:31:01.399014+05:00[Asia/Yekaterinburg]")

public class SpecialFood {
    @JsonProperty("golden")
    @Valid
    private List<Point3D> golden = null;

    @JsonProperty("suspicious")
    @Valid
    private List<Point3D> suspicious = null;

    public SpecialFood golden(List<Point3D> golden) {
        this.golden = golden;
        return this;
    }

    public SpecialFood addGoldenItem(Point3D goldenItem) {
        if (this.golden == null) {
            this.golden = new ArrayList<Point3D>();
        }
        this.golden.add(goldenItem);
        return this;
    }

    /**
     * Array of golden food items
     *
     * @return golden
     **/
    @ApiModelProperty(value = "Array of golden food items")

    @Valid

    public List<Point3D> getGolden() {
        return golden;
    }

    public void setGolden(List<Point3D> golden) {
        this.golden = golden;
    }

    public SpecialFood suspicious(List<Point3D> suspicious) {
        this.suspicious = suspicious;
        return this;
    }

    public SpecialFood addSuspiciousItem(Point3D suspiciousItem) {
        if (this.suspicious == null) {
            this.suspicious = new ArrayList<Point3D>();
        }
        this.suspicious.add(suspiciousItem);
        return this;
    }

    /**
     * Array of suspicious food items
     *
     * @return suspicious
     **/
    @ApiModelProperty(value = "Array of suspicious food items")

    @Valid

    public List<Point3D> getSuspicious() {
        return suspicious;
    }

    public void setSuspicious(List<Point3D> suspicious) {
        this.suspicious = suspicious;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpecialFood specialFood = (SpecialFood) o;
        return Objects.equals(this.golden, specialFood.golden) &&
                Objects.equals(this.suspicious, specialFood.suspicious);
    }

    @Override
    public int hashCode() {
        return Objects.hash(golden, suspicious);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecialFood {\n");

        sb.append("    golden: ").append(toIndentedString(golden)).append("\n");
        sb.append("    suspicious: ").append(toIndentedString(suspicious)).append("\n");
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

