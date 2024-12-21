package xyz.fiwka.datssnake2.model;

import java.util.List;

public record Point3D(int x, int y, int z) {
    public List<Integer> toList() {
        return List.of(x, y, z);
    }

    public static Point3D fromList(List<Integer> list) {
        return new Point3D(list.get(0), list.get(1), list.get(2));
    }
}