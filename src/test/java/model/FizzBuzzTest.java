package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzzEngine;

    @Before
    public void init() {
        fizzBuzzEngine = new FizzBuzz();
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", fizzBuzzEngine.fizzBuzz(3));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", fizzBuzzEngine.fizzBuzz(5));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzzEngine.fizzBuzz(15));
    }

    @Test
    public void testNone() {
        assertEquals("29", fizzBuzzEngine.fizzBuzz(29));
    }
}
