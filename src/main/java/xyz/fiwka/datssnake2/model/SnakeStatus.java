package xyz.fiwka.datssnake2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SnakeStatus {

    ALIVE("alive"), DEAD("dead");

    private final String value;

    SnakeStatus(String value) {
        this.value = value;
    }

    @JsonCreator
    public static SnakeStatus fromValue(String text) {
        for (SnakeStatus b : SnakeStatus.values()) {
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
