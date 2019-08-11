package FizzBuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTestTest {

    @Test
    public void count() {
        assertEquals("1", FizzBuss.count(1));
        assertEquals("Fizz", FizzBuss.count(3));
        assertEquals("Buzz", FizzBuss.count(5));
        assertEquals("FizzBuzz", FizzBuss.count(15));
        assertEquals("Fizz", FizzBuss.count(13));
        assertEquals("Buzz", FizzBuss.count(52));
        assertEquals("FizzBuzz", FizzBuss.count(54));
    }
}