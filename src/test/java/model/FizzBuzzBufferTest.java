package model;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzBufferTest {

    @Test
    public void testWithEqualBounds() {
        FizzBuzz mockFizzBuzzEngine = mock(FizzBuzz.class);
        FizzBuzzBuffer target = new FizzBuzzBuffer(mockFizzBuzzEngine);

        List<String> result = target.bufferValues(1,1);
        assertEquals(0, result.size());
    }

    @Test
    public void testOneValue() {
        FizzBuzz mockFizzBuzzEngine = mock(FizzBuzz.class);
        when(mockFizzBuzzEngine.fizzBuzz(anyInt())).thenReturn("");
        FizzBuzzBuffer target = new FizzBuzzBuffer(mockFizzBuzzEngine);

        List<String> result = target.bufferValues(1,2);
        assertEquals(1, result.size());
        assertEquals("", result.get(0));
    }

    @Test
    public void testSeveralValues() {
        FizzBuzz mockFizzBuzzEngine = mock(FizzBuzz.class);
        when(mockFizzBuzzEngine.fizzBuzz(anyInt())).thenReturn("");
        FizzBuzzBuffer target = new FizzBuzzBuffer(mockFizzBuzzEngine);

        List<String> result = target.bufferValues(0,20);
        assertEquals(20, result.size());
        for (int i = 0; i < 20; ++i) {
            assertEquals("",result.get(0));
        }
    }

}
