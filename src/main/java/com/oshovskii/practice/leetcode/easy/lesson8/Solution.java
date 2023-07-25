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


    public static int reverseOptimize(int x) {
        int result = 0;

        while (x != 0) {
            int pop = x % 10;
            x = x / 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            return result * 10 + pop;
        }
        return result;
    }

    public static int reverseOptimize2(int x) {
        String reverse = new StringBuilder().append(Math.abs(x)).reverse().toString();
        return x < 0 ? Integer.parseInt(reverse) * -1 : Integer.parseInt(reverse);
    }
}
