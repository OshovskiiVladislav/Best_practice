package com.oshovskii.practice.leetcode.easy.lesson50;

import java.util.HashMap;

public class Leetcode242 {
    public static void main(String[] args) {
        System.out.println(isAnagramFaster("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }


        HashMap<Character, Integer> hashMapS = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (hashMapS.get(symbol) != null) {
                hashMapS.put(symbol, hashMapS.get(symbol) + 1);
            } else {
                hashMapS.put(symbol, 1);
            }
        }

        HashMap<Character, Integer> hashMapT = new HashMap();
        for (int i = 0; i < t.length(); i++) {
            char symbol = t.charAt(i);
            if (hashMapT.get(symbol) != null) {
                hashMapT.put(symbol, hashMapT.get(symbol) + 1);
            } else {
                hashMapT.put(symbol, 1);
            }
        }

        return hashMapS.equals(hashMapT);

    }

    public static boolean isAnagramFaster(String s, String t) {
        int[] chars = new int[26];
        for (char current : s.toCharArray()) {
            chars[current - 'a']++;
        }
        for (char current : t.toCharArray()) {
            chars[current - 'a']--;
        }
        for (int current : chars) {
            if (current != 0) {
                return false;
            }
        }
        return true;
    }
}
