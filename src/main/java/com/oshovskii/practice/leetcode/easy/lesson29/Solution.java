package com.oshovskii.practice.leetcode.easy.lesson29;


public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        if (nums.length == 2 && (nums[0] == nums[1])) {
            return 1;
        }
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] == nums[i - 1]) {
                count++;
                System.arraycopy(nums, i, nums, i - 1, nums.length - i);
            }
        }
        return nums.length - count;
    }

    public int removeDuplicatesNumber(int[] nums) {
        if (nums.length == 0)
            return 0;
        int k = 1;
        int lastNum = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (lastNum < nums[i + 1]) {
                lastNum = nums[i + 1];
                nums[k] = nums[i + 1];
                k++;
            }
        }
        return k;
    }
}
