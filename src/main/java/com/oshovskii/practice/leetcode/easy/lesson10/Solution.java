package com.oshovskii.practice.leetcode.easy.lesson10;

public class Solution {
    public int fibRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibRecursion(n - 2) + fibRecursion(n - 1);
    }

    public int fib(int n) {
        int a = 1;
        int b = 1;
        if (n == 0) {
            return 0;
        }
        for (int i = 2; i < n; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }
}
