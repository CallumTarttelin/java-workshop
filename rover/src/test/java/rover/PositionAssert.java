package rover;

import org.assertj.core.api.AbstractAssert;

import java.util.Objects;

public class PositionAssert extends AbstractAssert<PositionAssert, Position> {
    public PositionAssert(Position actual) {
        super(actual, PositionAssert.class);
    }

    public static PositionAssert assertThat(Position actual) {
        return new PositionAssert(actual);
    }

    public PositionAssert hasCoordinates(int x, int y) {
        isNotNull();
        if (!Objects.equals(actual.getX(), x) || !Objects.equals(actual.getY(), y)) {
            failWithMessage("Expected Position (%s, %s) but was (%s, %s)",
                    x, y, actual.getX(), actual.getY());
        }
        return this;
    }

    public PositionAssert hasX(int x) {
        isNotNull();
        if (!Objects.equals(actual.getX(), x)) {
            failWithMessage("Expected x to be <%s> but was <%s>", x, actual.getX());
        }
        return this;
    }

    public PositionAssert hasY(int y) {
        isNotNull();
        if (!Objects.equals(actual.getY(), y)) {
            failWithMessage("Expected y to be <%s> but was <%s>", y, actual.getY());
        }
        return this;
    }

    public PositionAssert isFacing(Position.Direction direction) {
        isNotNull();
        if (!Objects.equals(actual.getDirection(), direction)) {
            failWithMessage("Expected direction to be <%s> but was <%s>", direction.toString(), actual.getDirection().toString());
        }
        return this;
    }
}
