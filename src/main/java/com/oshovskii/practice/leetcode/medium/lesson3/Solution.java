package com.oshovskii.practice.leetcode.medium.lesson3;

public class Solution {
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        int transferDigit = 0;
        digits[digits.length - 1]++;

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] + transferDigit;
            if (digits[i] > 9) {
                digits[i] = 0;
                transferDigit = 1;
            } else {
                transferDigit = 0;
            }
        }

        if (transferDigit == 1) {
            int[] tmpArr = new int[digits.length + 1];
            tmpArr[0] = 1;
            System.arraycopy(digits, 0, tmpArr, 1, digits.length);
            digits = tmpArr;
        }

        return digits;
    }
}