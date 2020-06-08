package rover;

import static rover.Position.*;

public class Rover {

    Position move(String instructions) {
        Position start = at(0, 0, Direction.NORTH);
        int x = start.getX();
        int y = start.getY();
        Direction direction = start.getDirection();
        if (direction == Direction.NORTH) {
            System.out.println("Direction is North.");
        }
        throw new UnsupportedOperationException("Not implemented!");
    }

}
