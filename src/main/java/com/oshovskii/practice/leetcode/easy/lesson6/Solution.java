package com.oshovskii.practice.leetcode.easy.lesson6;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome2(1441));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int saveX = x;
        int numberPalindrome = 0;
        while (x > 0) {
            numberPalindrome = numberPalindrome * 10;
            numberPalindrome = numberPalindrome + x % 10;
            x = x / 10;
        }
        return numberPalindrome == saveX;
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        String s = null;
        try {
            s = String.valueOf(x);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(s);
    }

    public static boolean isPalindrome3(int x) {
        return new StringBuilder(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }
}
