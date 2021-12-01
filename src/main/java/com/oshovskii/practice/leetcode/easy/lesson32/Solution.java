package com.oshovskii.practice.leetcode.easy.lesson32;

public class Solution {
    public static void main(String[] args) {
        System.out.println(mySqrt(6));
    }

    public static int mySqrt(int x) {
        long result = 0;

        while (result * result <= x) {
            result++;
        }

        return (int) result - 1;
    }

    public int mySqrtBinarySearch(int x) {
        int start = 1;
        int end = x;
        int res = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid) {
                start = mid + 1;
                res = mid;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}
