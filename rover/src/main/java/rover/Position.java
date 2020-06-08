package rover;

public final class Position {

    private final int x;
    private final int y;

    private final Direction direction;

    private Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public static Position at(int x, int y, Direction direction) {
        return new Position(x, y, direction);
    }

    public enum Direction {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }
}
