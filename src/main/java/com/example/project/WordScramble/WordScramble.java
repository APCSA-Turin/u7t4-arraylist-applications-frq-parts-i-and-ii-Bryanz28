package com.example.project.WordScramble;

import java.util.ArrayList;

public class WordScramble {

    public static String scrambleWord(String word) {
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == 'A' && chars[i + 1] != 'A') {
                char temp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = temp;
                i++; 
            }
        }

        return new String(chars);
    }

    public static ArrayList<String> scrambleOrRemove(ArrayList<String> wordList) {
        ArrayList<String> scrambledList = new ArrayList<>();

        for (String word : wordList) {
            String scrambled = scrambleWord(word);
            if (!scrambled.equals(word)) { 
                scrambledList.add(scrambled);
            }
        }

        return scrambledList;
    }
}
