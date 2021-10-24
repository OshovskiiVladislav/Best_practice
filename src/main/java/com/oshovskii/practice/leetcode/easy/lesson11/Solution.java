package com.oshovskii.practice.leetcode.easy.lesson11;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        if (n == 0) {
            return false;
        }
        if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0 || n % 11 == 0 || n % 13 == 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }
}
