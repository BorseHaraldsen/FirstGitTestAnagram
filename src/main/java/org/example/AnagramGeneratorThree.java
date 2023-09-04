package org.example;

import java.nio.IntBuffer;
import java.util.stream.*;

public class AnagramGeneratorThree {

    public String[] words = {"evil","funeral","Santa"};
    public boolean anagramsThree = Stream.of(words)
            .map(s -> IntBuffer.wrap(s.chars().sorted().toArray()))
            .distinct().count() == 1;


}
