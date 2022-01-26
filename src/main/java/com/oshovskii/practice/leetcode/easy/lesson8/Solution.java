package com.oshovskii.practice.leetcode.easy.lesson8;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(1534236));
    }

    public static int reverse(int x) {
        long reverse = 0;
        while (x != 0) {
            reverse = reverse * 10;
            reverse = reverse + x % 10;
            x = x / 10;
        }
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reverse;
    }
}
