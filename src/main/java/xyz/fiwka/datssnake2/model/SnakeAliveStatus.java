package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SnakeAliveStatus {

    ALIVE("alive"), DEAD("dead");

    private final String value;

    SnakeAliveStatus(String value) {
        this.value = value;
    }

    @JsonCreator
    public static SnakeAliveStatus fromValue(String text) {
        for (SnakeAliveStatus b : SnakeAliveStatus.values()) {
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
