package com.edu.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CreateIntStream {
    public List<Integer> getStream(int start, int end) {
        return IntStream.range(start, end).boxed().collect(Collectors.toList());
    }
//0 end 5
}
