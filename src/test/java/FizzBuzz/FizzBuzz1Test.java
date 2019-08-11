package FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz1Test {

    @Test
    public void of() {
        Assert.assertEquals("1", FizzBuzz1.of(1));
        Assert.assertEquals("Fizz", FizzBuzz1.of(3));
        Assert.assertEquals("Buzz", FizzBuzz1.of(5));
        Assert.assertEquals("FizzBuzz", FizzBuzz1.of(15));
        Assert.assertEquals("Fizz", FizzBuzz1.of(31));
        Assert.assertEquals("Buzz", FizzBuzz1.of(52));
        Assert.assertEquals("FizzBuzz", FizzBuzz1.of(53));
    }
}
