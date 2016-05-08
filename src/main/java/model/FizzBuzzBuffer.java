package model;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzzBuffer {
    private FizzBuzz _fizzBuzzEngine;

    public FizzBuzzBuffer(FizzBuzz fizzBuzzEngine) {
        _fizzBuzzEngine = fizzBuzzEngine;
    }

    public List<String> bufferValues(int from, int to) {
        List<String> values = new LinkedList<String>();
        for (int i = from; i < to; ++i) {
            values.add(_fizzBuzzEngine.fizzBuzz(i));
        }
        return values;
    }
}
