package com.oshovskii.practice.leetcode.easy.lesson81;

import java.util.ArrayList;
import java.util.List;

/**
 * 507. Perfect Number
 * https://leetcode.com/problems/perfect-number/description/
 */
public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        if (num == 6) {
            return true;
        }
        int divisorsSum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                divisorsSum = divisorsSum + i;
            }
        }
        return divisorsSum == num;
    }

    public boolean checkPerfectNumberIntuition(int num) {
        int num1 = 0;
        if (num % 2 != 0) {
            return false;
        } else {
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    num1 += i;
                }
            }
        }

        return num1 == num;
    }
}
