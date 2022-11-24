package com.oshovskii.practice.leetcode.easy.lesson9;

public class Solution {
    public void reverseString(char[] s) {
        char tmp;
        for (int i = 0; i < s.length / 2; i++) {
            tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }

    public void reverseStringRecursion(char[] s) {
        swap(s, 0);
    }

    private static char[] swap(char[] chars, int index) {
        if (index >= chars.length / 2) {
            return chars;
        }
        char tmp = chars[index];
        chars[index] = chars[chars.length - index - 1];
        chars[chars.length - index - 1] = tmp;
        return swap(chars, index + 1);
    }
}
