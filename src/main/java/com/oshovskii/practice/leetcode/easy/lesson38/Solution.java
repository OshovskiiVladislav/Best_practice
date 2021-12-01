package com.oshovskii.practice.leetcode.easy.lesson38;

public class Solution {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,1,2,0,1}));
    }
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int iMax = 0, iMin = 0;
        int maxProfit = 0;

        for (int i = prices.length - 1; i >= 0 ; i--) {
            if (prices[i] > max) {
                max = prices[i];
                iMax = i;
                if (iMax < iMin) {
                    min = Integer.MAX_VALUE;
                }
            }
            if (prices[i] < min) {
                min = prices[i];
                iMin = i;
            }
            if (iMax > iMin && maxProfit < max - min) {
                maxProfit = max - min;
            }
        }

        return maxProfit;
    }
}
