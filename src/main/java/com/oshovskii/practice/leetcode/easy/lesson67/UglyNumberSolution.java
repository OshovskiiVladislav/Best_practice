package com.oshovskii.practice.leetcode.easy.lesson67;

import java.util.ArrayList;
import java.util.List;

/**
 * 263. Ugly Number
 * https://leetcode.com/problems/ugly-number/
 */
public class UglyNumberSolution {

    public static boolean isUgly(int n) {
        ArrayList<Integer> listUgly = new ArrayList<>();
        listUgly.add(2);
        listUgly.add(3);
        listUgly.add(5);
        return isUglyRecursion(n, listUgly);
    }

    public static boolean isUglyRecursion(int n, List<Integer> listUgly) {
        if (n < 1) {
            return false;
        }
        if (n <= 6) {
            return true;
        }
        if (listUgly.contains(n)) {
            return true;
        }
        for (Integer uglyNumber : listUgly) {
            if (n % uglyNumber == 0) {
                return isUglyRecursion(n / uglyNumber, listUgly);
            }
        }
        return false;
    }

}
