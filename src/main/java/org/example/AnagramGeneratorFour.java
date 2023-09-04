package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramGeneratorFour {
    public boolean checkStrings(String s1, String s2, String s3, String s4) {
        s1.replaceAll("\\s", "");
        s2.replaceAll("\\s", "");
        s3.replaceAll("\\s", "");
        s4.replaceAll("\\s", "");
        boolean result1 = true;
        if (s1.length() != s2.length()) {
            result1 = false;
        } else {
            char[] s1Ch = s1.toLowerCase().toCharArray();
            char[] s2Ch = s2.toLowerCase().toCharArray();
            char[] s3Ch = s3.toLowerCase().toCharArray();
            char[] s4Ch = s4.toLowerCase().toCharArray();
            Arrays.sort(s1Ch);
            Arrays.sort(s2Ch);
            Arrays.sort(s3Ch);
            Arrays.sort(s4Ch);
            result1 = Arrays.equals(s1Ch, s2Ch);
        }

        boolean result2 = true;

        if (s1.length() != s3.length()) {
            result2 = false;
        } else {
            char[] s1Ch = s1.toLowerCase().toCharArray();
            char[] s2Ch = s2.toLowerCase().toCharArray();
            char[] s3Ch = s3.toLowerCase().toCharArray();
            char[] s4Ch = s4.toLowerCase().toCharArray();
            Arrays.sort(s1Ch);
            Arrays.sort(s2Ch);
            Arrays.sort(s3Ch);
            Arrays.sort(s4Ch);
            result2 = Arrays.equals(s1Ch, s2Ch);
        }
        boolean result3 = true;
        if (s1.length() != s4.length()) {
            result3 = false;
        } else {
            char[] s1Ch = s1.toLowerCase().toCharArray();
            char[] s2Ch = s2.toLowerCase().toCharArray();
            char[] s3Ch = s3.toLowerCase().toCharArray();
            char[] s4Ch = s4.toLowerCase().toCharArray();
            Arrays.sort(s1Ch);
            Arrays.sort(s2Ch);
            Arrays.sort(s3Ch);
            Arrays.sort(s4Ch);
            result3 = Arrays.equals(s1Ch, s2Ch);
        }


        if (result1) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT anagrams");
        }
        if (result2) {
            System.out.println(s1 + " and " + s3 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s3 + " are NOT anagrams");
        }
        if (result3) {
            System.out.println(s1 + " and " + s4 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s4 + " are NOT anagrams");

        }

        return result1;

    }

}

