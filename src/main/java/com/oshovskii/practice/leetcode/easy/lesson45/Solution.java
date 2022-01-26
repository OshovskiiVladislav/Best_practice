package com.oshovskii.practice.leetcode.easy.lesson45;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        HashSet hashSet = new HashSet<>();
        return isHappyRec(n, hashSet);
    }

    public boolean isHappyRec(int n, HashSet<Integer> hashSet) {
        if (n == 1) {
            return true;
        }

        if (hashSet.contains(n)) {
            return false;
        }

        int n1 = n;
        int sum = 0;

        hashSet.add(n);

        while (n1 > 0) {
            int digit = n1 % 10;
            n1 = n1 / 10;
            sum += Math.pow(digit, 2);
        }

        return isHappyRec(sum, hashSet);
    }


}
