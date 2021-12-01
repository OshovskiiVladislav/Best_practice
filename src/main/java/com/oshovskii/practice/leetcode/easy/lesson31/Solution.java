package com.oshovskii.practice.leetcode.easy.lesson31;

public class Solution {

    public int maxSubArrayKadaneAlgorithm(int[] nums) {
        int maximum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i] + nums[i - 1])
                nums[i] = nums[i] + nums[i - 1];
            if (maximum < nums[i])
                maximum = nums[i];
        }
        return maximum;
    }

    /**
     * Tect Time Limit Exceeded
     */
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum > maxSum)
                    maxSum = sum;
            }
        }
        return maxSum;
    }
}

