package com.oshovskii.practice.leetcode.easy.lesson33;

import java.math.BigInteger;

public class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;

        BigInteger result = BigInteger.ZERO;
        int length = n;

        for (int i = 0; i <= n / 2 + n % 2; i++) {
            result = result.add(getFactorial(length).divide(getFactorial(i).multiply(getFactorial(length - i))));
            length--;
        }

        return result.intValue();
    }

    public static BigInteger getFactorial(int f) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }


    /**
     * Fibonacci numbers
     */
    public static int climbStairsOptimal(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return n;
        }

        int[] s = new int[n + 1];

        s[0] = 0;
        s[1] = 1;
        s[2] = 2;

        for (int i = 3; i <= n; i++) {
            s[i] = s[i - 1] + s[i - 2];
        }
        return s[n];
    }
}
