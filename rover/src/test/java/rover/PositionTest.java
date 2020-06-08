package rover;

import org.junit.jupiter.api.Test;
import rover.Position.Direction;

import static org.assertj.core.api.Assertions.*;

class PositionTest {

    @Test void testPositions() {
        var position = Position.at(3, 5, Direction.NORTH);
        PositionAssert.assertThat(position)
                .isNotNull()
                .hasCoordinates(3, 5)
                .hasX(3)
                .hasY(5)
                .isFacing(Direction.NORTH);
        assertThat(position.getX()).isEqualTo(3);
        assertThat(position.getY()).isEqualTo(5);
        assertThat(position.getDirection()).isEqualTo(Direction.NORTH);
    }

}
