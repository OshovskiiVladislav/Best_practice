package com.oshovskii.practice.leetcode.easy.lesson73;

import java.util.*;

/**
 * 953. Verifying an Alien Dictionary
 * https://leetcode.com/problems/verifying-an-alien-dictionary/
 */
public class VerifyingAnAlienDictionarySolution {
    public boolean isAlienSorted(String[] words, String order) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            boolean result = compareTwoWords(words[i], words[i + 1], map);
            if (!result) {
                return false;
            }
        }

        return true;
    }

    public boolean compareTwoWords(String word1, String word2, Map<Character, Integer> map) {
        int min = Math.min(word1.length(), word2.length());

        for (int i = 0; i < min; i++) {
            Integer word1Current = map.get(word1.charAt(i));
            Integer word2Current = map.get(word2.charAt(i));
            if (word1Current > word2Current) {
                return false;
            }
            if (word1Current < word2Current) {
                return true;
            }
        }
        return word1.length() <= word2.length();
    }

}
