package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @BeforeEach void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    @Test void fizzbuzzWorksForTwenty() {
        var expected = Arrays.asList(
                "1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz",
                "11", "fizz", "13", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz"
        );

        List<String> actual = fizzbuzz.fizzbuzz(20);

        assertThat(actual)
                .hasSize(20)
                .contains("fizzbuzz")
                .isEqualTo(expected);
    }

    @Test void fizzbuzzAlwaysSameLengthAsInput() {
        for (var i = 1; i < 1000; i+=10) {
            assertThat(fizzbuzz.fizzbuzz(i))
                    .hasSize(i);
        }
    }

    @Test void fizzbuzzZeroIsEmpty() {
        assertThat(fizzbuzz.fizzbuzz(0))
                .isEmpty();
    }

    @Disabled
    @Test void fizzBuzzWorksForManyRanges() {
        for (var i = 0; i < 1000; i+= 10) {
            var result = fizzbuzz.fizzbuzz(i);
            // var actual = demoFizzbuzz.fizzbuzz(i)
            // Compare result and actual
        }
    }

}
