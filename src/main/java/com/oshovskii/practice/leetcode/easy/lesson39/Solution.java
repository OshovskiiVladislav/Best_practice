package com.oshovskii.practice.leetcode.easy.lesson39;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.toLowerCase());
        int idx = 0;
        while (idx < stringBuilder.length()) {
            char ch = stringBuilder.charAt(idx);
            if (Character.isLetterOrDigit(ch)) {
                idx += 1;
            } else {
                stringBuilder.deleteCharAt(idx);
            }
        }
        int n = stringBuilder.length();

        for (int i = 0; i < n / 2; i++) {
            int j = n - i - 1;
            if (stringBuilder.charAt(i) != stringBuilder.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeRegular(String s) {
        String trimmed = s.toLowerCase().replaceAll("[\\W_]", "");
        String reversed = new StringBuilder(trimmed).reverse().toString();

        return trimmed.equals(reversed);
    }
}
