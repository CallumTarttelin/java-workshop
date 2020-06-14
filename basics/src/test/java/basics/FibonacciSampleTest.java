/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciSampleTest {
    @Test void testFib() {
        FibonacciSample classUnderTest = new FibonacciSample();
        assertEquals(5, classUnderTest.fib(5));
        assertEquals(55, classUnderTest.fib(10));
        assertEquals(13, classUnderTest.fib(7));
        assertEquals(610, classUnderTest.fib(15));
        assertEquals(34, classUnderTest.fib(9));
        assertEquals(2, classUnderTest.fib(3));
    }
}

