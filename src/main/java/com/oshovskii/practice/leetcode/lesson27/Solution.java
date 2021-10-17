package com.oshovskii.practice.leetcode.lesson27;

public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        if (s.length() == 1) {
            return value(s.charAt(0));
        }
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                if (s1 >= s2) {
                    result = result + s1;
                } else {
                    result = result + s2 - s1;
                    i++;
                }
            } else {
                result = result + s1;
            }
        }
        return result;
    }

    private int value(char c) {
        int result;
        switch (c) {
            case 'I' -> result = 1;
            case 'V' -> result = 5;
            case 'X' -> result = 10;
            case 'L' -> result = 50;
            case 'C' -> result = 100;
            case 'D' -> result = 500;
            case 'M' -> result = 1000;
            default -> result = -1;
        }
        return result;
    }
}
