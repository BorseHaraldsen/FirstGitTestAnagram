package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

public class AnagramGeneratorTwo {


    String[] words ={"Coronavirus", "tset", "estt"};
    // ArrayList<String> words = new ArrayList<>();

    public boolean anagrams = Stream.of(words)
            .map(String::chars).map(IntStream::sorted)
            .map(IntStream::toArray).map(Arrays::toString)
            .distinct().count() == 1;



}
