package org.example;

import java.util.*;

public class AnagramGeneratorSix {
    public HashMap<String, List<String>> anagramGroups;

    public  HashMap<String, ArrayList<String>> test = new HashMap<>();
    public AnagramGeneratorSix() {
        test = new HashMap<>();
    }
    /*
    public AnagramGeneratorSix() {
        anagramGroups = new HashMap<>();
    }

     */

    public void addWord(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String sortedWord = new String(charArray);

        test.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
    }


    public boolean areAnagrams(String word1, String word2) {
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public HashMap<String, ArrayList<String>> anagramChecker(ArrayList<String> list) {


        list.add("dog");
        list.add("coronavirus");
        list.add("carnivorous");

        for (String word : list) {
            addWord(word);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                String word1 = list.get(i);
                String word2 = list.get(j);
                boolean areAnagrams = areAnagrams(word1, word2);
                if (areAnagrams) {
                    System.out.println(word1 + " and " + word2 + " are anagrams.");
                } else {
                    System.out.println(word1 + " and " + word2 + " are not anagrams");
                }

            }


        }

return test;

    }

}