import org.example.AnagramGeneratorSix;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestingAnagramSix {

    AnagramGeneratorSix anagramGeneratorSix = new AnagramGeneratorSix();
/*
    @Test
    void printAnagramsSix() {
        AnagramGeneratorSix anagramChecker = new AnagramGeneratorSix();
        String[] words = {"dog", "coronavirus", "lol", "carnivorous", "god", "test", "oll"};

        for (String word : words) {
            anagramChecker.addWord(word);
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String word1 = words[i];
                String word2 = words[j];
                boolean areAnagrams = anagramChecker.areAnagrams(word1, word2);
                boolean areNotAnagrams = anagramChecker.areAnagrams(word1, word2);
                if (areAnagrams) {
                    System.out.println(word1 + " and " + word2 + " are anagrams.");
                } else {
                    System.out.println(word1 + " and " + word2 + " are not anagrams");
                }
            }

        }

    }

    @Test
    public void testAnagram2() {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("dog");
        arrayList.add("coronavirus");
        arrayList.add("carnivorous");

        HashMap<String, ArrayList<String>> test2 = new HashMap<>();
        ArrayList<String> anagram = new ArrayList<>();
        anagram.add("carnivorous");

        test2.put("coronavirus", anagram);

        HashMap<String, ArrayList<String>> result = anagramGeneratorSix.anagramChecker(arrayList);


        assertEquals(test2.get("coronavirus").get(0), result.get("coronavirus").get(2));
//        arrayList.add("coronavirus""lol", "carnivorous")
    }
*/

}
