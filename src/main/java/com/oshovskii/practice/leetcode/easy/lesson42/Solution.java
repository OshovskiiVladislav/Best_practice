package com.oshovskii.practice.leetcode.easy.lesson42;

public class Solution {
    private int CORRECT_WITH_ASCII = 64;
    private int COUNT_ALPHABET = 26;

    public int titleToNumber(String columnTitle) {
        double result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result += Math.pow(COUNT_ALPHABET, columnTitle.length() - (i + 1)) * (columnTitle.charAt(i) - CORRECT_WITH_ASCII);
        }
        return (int) result;
    }
}
