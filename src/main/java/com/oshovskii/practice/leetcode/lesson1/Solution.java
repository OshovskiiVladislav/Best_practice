package com.oshovskii.practice.leetcode.lesson1;

public class Solution {


    public static void main(String[] args) {
        System.out.println(isPrefixString("iloveleetcode", new String[]{"apples","i","love","leetcode"}));
    }

    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word);
            if (stringBuilder.length() == s.length()) {
                break;
            }
            if (!s.startsWith(stringBuilder.toString())) {
                return false;
            }
        }
        return s.equals(stringBuilder.toString());
    }
}
