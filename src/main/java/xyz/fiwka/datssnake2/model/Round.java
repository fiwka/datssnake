package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Round
 */
@Validated
@Deprecated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-12-20T23:31:01.399014+05:00[Asia/Yekaterinburg]")

public class Round {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("startAt")
    private OffsetDateTime startAt = null;

    @JsonProperty("endAt")
    private OffsetDateTime endAt = null;

    @JsonProperty("duration")
    private Integer duration = null;
    @JsonProperty("status")
    private StatusEnum status = null;
    @JsonProperty("repeat")
    private Integer repeat = null;

    public Round name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the game round
     *
     * @return name
     **/
    @ApiModelProperty(example = "final-3", value = "Name of the game round")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Round startAt(OffsetDateTime startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * Round start time in ISO 8601 format
     *
     * @return startAt
     **/
    @ApiModelProperty(value = "Round start time in ISO 8601 format")

    @Valid

    public OffsetDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(OffsetDateTime startAt) {
        this.startAt = startAt;
    }

    public Round endAt(OffsetDateTime endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * Round end time in ISO 8601 format
     *
     * @return endAt
     **/
    @ApiModelProperty(value = "Round end time in ISO 8601 format")

    @Valid

    public OffsetDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(OffsetDateTime endAt) {
        this.endAt = endAt;
    }

    public Round duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Duration of the round in seconds
     *
     * @return duration
     **/
    @ApiModelProperty(example = "3300", value = "Duration of the round in seconds")


    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Round status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Current status of the round
     *
     * @return status
     **/
    @ApiModelProperty(example = "ended", value = "Current status of the round")


    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Round repeat(Integer repeat) {
        this.repeat = repeat;
        return this;
    }

    /**
     * Number of times the round repeats (0 for no repeat)
     *
     * @return repeat
     **/
    @ApiModelProperty(example = "0", value = "Number of times the round repeats (0 for no repeat)")


    public Integer getRepeat() {
        return repeat;
    }

    public void setRepeat(Integer repeat) {
        this.repeat = repeat;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Round round = (Round) o;
        return Objects.equals(this.name, round.name) &&
                Objects.equals(this.startAt, round.startAt) &&
                Objects.equals(this.endAt, round.endAt) &&
                Objects.equals(this.duration, round.duration) &&
                Objects.equals(this.status, round.status) &&
                Objects.equals(this.repeat, round.repeat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startAt, endAt, duration, status, repeat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Round {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
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
     * Current status of the round
     */
    public enum StatusEnum {
        NOT_STARTED("not started"),

        ACTIVE("active"),

        ENDED("ended");

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

