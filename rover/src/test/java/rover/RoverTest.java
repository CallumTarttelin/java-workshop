package rover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import rover.Position.Direction;

import static rover.PositionAssert.assertThat;

@Disabled
class RoverTest {

    private Rover rover;

    @BeforeEach void setUp() {
        rover = new Rover();
    }

    @Test void roverStartsAtOrigin() {
        var pos = rover.move("");

        assertThat(pos).hasCoordinates(0, 0);
    }

    @Test void roverCanMoveForward() {
        var pos = rover.move("ffff");
        assertThat(pos).hasY(4);
        assertThat(pos).isFacing(Direction.NORTH);
    }

    @Test void roverCanTurnLeft() {
        var pos = rover.move("lfff");
        assertThat(pos).hasX(-3);
        assertThat(pos).isFacing(Direction.WEST);
    }

    @Test void roverCanMoveInACircle() {
        var pos = rover.move("rrrrf");
        assertThat(pos).hasCoordinates(0, 1);
        assertThat(pos).isFacing(Direction.NORTH);
    }

    @Test void roverCanMove() {
        var pos = rover.move("fffllfffrfffrffflssssss");
        assertThat(pos).hasCoordinates(3, 3);
        assertThat(pos).isFacing(Direction.WEST);
    }

}
