package xyz.fiwka.datssnake2.model;

import lombok.Getter;

import java.util.List;

@Getter
public class Direction3D {

    private final int x;
    private final int y;
    private final int z;

    private Direction3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Direction3D negativeXDirection() {
        return new Direction3D(-1, 0, 0);
    }

    public static Direction3D positiveXDirection() {
        return new Direction3D(1, 0, 0);
    }

    public static Direction3D negativeYDirection() {
        return new Direction3D(0, -1, 0);
    }

    public static Direction3D positiveYDirection() {
        return new Direction3D(0, 1, 0);
    }

    public static Direction3D negativeZDirection() {
        return new Direction3D(0, 0, -1);
    }

    public static Direction3D positiveZDirection() {
        return new Direction3D(0, 0, 1);
    }

    public List<Integer> toList() {
        return List.of(this.x, this.y, this.z);
    }
}