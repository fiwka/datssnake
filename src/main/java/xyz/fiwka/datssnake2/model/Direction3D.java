package xyz.fiwka.datssnake2.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

    public List<Integer> toList() {
        return List.of(this.x, this.y, this.z);
    }

    @RequiredArgsConstructor
    public enum Cords {

        X(0), Y(1), Z(2);

        private final int cordIndex;

        public Direction3D positive() {
            List<Integer> direction = new ArrayList<>(List.of(0, 0, 0));
            direction.set(cordIndex, 1);
            return new Direction3D(direction.get(0), direction.get(1), direction.get(2));
        }

        public Direction3D negative() {
            List<Integer> direction = new ArrayList<>(List.of(0, 0, 0));
            direction.set(cordIndex, -1);
            return new Direction3D(direction.get(0), direction.get(1), direction.get(2));
        }
    }
}