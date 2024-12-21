package xyz.fiwka.datssnake2.feign.header;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccessTokenHeader {

    @JsonProperty("X-Auth-Token")
    private final String xAuthToken;

    public static AccessTokenHeader of(String xAuthToken) {
        return new AccessTokenHeader(xAuthToken);
    }

}