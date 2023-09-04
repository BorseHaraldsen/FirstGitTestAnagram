import org.example.AnagramGeneratorThree;
import org.example.AnagramGeneratorTwo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingAnagramThree {

    @Test
    void printAnagramsThree() {


        AnagramGeneratorThree anagramGeneratorThree = new AnagramGeneratorThree();

        assertEquals(true,anagramGeneratorThree.anagramsThree);

        System.out.println("They are anagrams");
        System.out.println(Arrays.toString(anagramGeneratorThree.words));

    }


}
