package com.oshovskii.practice.leetcode.easy.lesson5;

public class Solution {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return null;
        }

        String previous = strs[0];
        int skip = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() <= previous.length()) {
                previous = strs[i];
                skip = i;
            }
        }

        for (int i = 0; i < previous.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (j == skip) {
                    continue;
                }
                if (previous.charAt(i) != strs[j].charAt(i)) {
                    return previous.substring(0, i);
                }
            }
        }
        return previous;
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null) {
            throw new IllegalArgumentException("Test");
        }

        if (strs.length == 0) {
            return "";
        }

        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty()) {
                    return "";
                }
            }
        }
        return result;
    }
}

