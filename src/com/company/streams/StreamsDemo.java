package com.company.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsDemo {
    public static void show(){
        IntStream.rangeClosed(1, 5)
                .forEach(n -> System.out.println(n));
    }
}
