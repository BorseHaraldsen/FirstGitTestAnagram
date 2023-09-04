import org.example.AnagramGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingAnagram {


    @Test
    void printAnagrams() {

        String str1 = "Geeksforgeeks";
        String str2 = "forGeeksgeeks";


        AnagramGenerator anagramGenerator = new AnagramGenerator();

        assertEquals(true,anagramGenerator.anagramGenerator(str1, str2));

    }

}
