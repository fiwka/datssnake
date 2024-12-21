package xyz.fiwka.datssnake2.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.comparator.Comparators;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Data
@NoArgsConstructor
public class Snake implements Comparable<Snake> {

    private String id;
    private Direction3D direction;
    private Direction3D oldDirection;
    private List<Point3D> geometry = Collections.emptyList();
    private int deathCount;
    private SnakeAliveStatus status;
    private int reviveRemainMs;

    public Snake(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Snake o) {
        return Comparator.<Snake, String>comparing(snake -> o.getId()).compare(this, o);
    }
}

