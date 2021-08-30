package com.oshovskii.practice.leetcode.lesson13;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] wordArray = s.split(" ");
        if (wordArray[wordArray.length - 1].equals(" ")) {
            return -1;
        }
        if (wordArray[wordArray.length - 1].equals("!")) {
            return -1;
        }
        if (wordArray[wordArray.length - 1].equals("?")) {
            return -1;
        }
        if (wordArray[wordArray.length - 1].equals(".")) {
            return -1;
        }
        return wordArray[wordArray.length - 1].length();
    }

    public int lengthOfLastWordVersionTwo(String s) {
        s = s.trim();
        return s.substring(s.lastIndexOf(" ") + 1, s.length()).length();
    }
}
