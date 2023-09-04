package org.example;

import java.util.HashMap;

public class AnagramGenerator {

    public boolean anagramGenerator(String nr1, String nr2) {

        HashMap<Character, Integer> hmap1
                = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmap2
                = new HashMap<Character, Integer>();

        char arr1[] = nr1.toCharArray();
        char arr2[] = nr2.toCharArray();

        for (int i = 0; i < arr1.length; i++) {

            if (hmap1.get(arr1[i]) == null) {

                hmap1.put(arr1[i], 1);
            }
            else {
                Integer c = (int)hmap1.get(arr1[i]);
                hmap1.put(arr1[i], ++c);
            }
        }

        for (int j = 0; j < arr2.length; j++) {

            if (hmap2.get(arr2[j]) == null)
                hmap2.put(arr2[j], 1);
            else {

                Integer d = (int)hmap2.get(arr2[j]);
                hmap2.put(arr2[j], ++d);
            }
        }

        if (hmap1.equals(hmap2))
            return true;
        else
            return false;
    }

    public void test(String str1, String str2)
    {

        System.out.println("Strings to be checked are:\n"
                + str1 + "\n" + str2 + "\n");

        // Find the result
        if (anagramGenerator (str1, str2))
            System.out.println("The two strings are "
                    + "anagrams of each other\n");
        else
            System.out.println("The two strings are not"
                    + " anagrams of each other\n");
    }

        /*
        ArrayList<String> result =new ArrayList<>();


        String[] alphabet = {"a","b","c"}

        String[] wordList ={"coronavirus", "evil", "funeral", "santa"};

        return null;

         */

    }


