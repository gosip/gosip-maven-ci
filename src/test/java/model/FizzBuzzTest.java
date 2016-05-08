package model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void testNone() {
        assertEquals("29", FizzBuzz.fizzBuzz(29));
    }
}
