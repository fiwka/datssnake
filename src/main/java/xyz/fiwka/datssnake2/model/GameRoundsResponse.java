package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GameRoundsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-12-20T23:31:01.399014+05:00[Asia/Yekaterinburg]")

public class GameRoundsResponse {
    @JsonProperty("gameName")
    private String gameName = null;

    @JsonProperty("rounds")
    @Valid
    private List<Round> rounds = new ArrayList<Round>();

    @JsonProperty("now")
    private OffsetDateTime now = null;

    public GameRoundsResponse gameName(String gameName) {
        this.gameName = gameName;
        return this;
    }

    /**
     * Name of the game
     *
     * @return gameName
     **/
    @ApiModelProperty(example = "snake3d", required = true, value = "Name of the game")
    @NotNull


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public GameRoundsResponse rounds(List<Round> rounds) {
        this.rounds = rounds;
        return this;
    }

    public GameRoundsResponse addRoundsItem(Round roundsItem) {
        this.rounds.add(roundsItem);
        return this;
    }

    /**
     * List of game rounds
     *
     * @return rounds
     **/
    @ApiModelProperty(required = true, value = "List of game rounds")
    @NotNull

    @Valid

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public GameRoundsResponse now(OffsetDateTime now) {
        this.now = now;
        return this;
    }

    /**
     * Current server time in ISO 8601 format
     *
     * @return now
     **/
    @ApiModelProperty(required = true, value = "Current server time in ISO 8601 format")
    @NotNull

    @Valid

    public OffsetDateTime getNow() {
        return now;
    }

    public void setNow(OffsetDateTime now) {
        this.now = now;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GameRoundsResponse gameRoundsResponse = (GameRoundsResponse) o;
        return Objects.equals(this.gameName, gameRoundsResponse.gameName) &&
                Objects.equals(this.rounds, gameRoundsResponse.rounds) &&
                Objects.equals(this.now, gameRoundsResponse.now);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameName, rounds, now);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GameRoundsResponse {\n");

        sb.append("    gameName: ").append(toIndentedString(gameName)).append("\n");
        sb.append("    rounds: ").append(toIndentedString(rounds)).append("\n");
        sb.append("    now: ").append(toIndentedString(now)).append("\n");
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

