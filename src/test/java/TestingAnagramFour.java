import org.example.AnagramGeneratorFour;
import org.example.AnagramGeneratorThree;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingAnagramFour {

    @Test
    void printAnagramsThree() {


        AnagramGeneratorFour anagramGeneratorFour = new AnagramGeneratorFour();

        assertEquals(true,anagramGeneratorFour.checkStrings("keep", "Peek","epek","epoch"));


    }

}
