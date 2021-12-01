package com.oshovskii.practice.leetcode.easy.lesson6;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1441));
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
}
