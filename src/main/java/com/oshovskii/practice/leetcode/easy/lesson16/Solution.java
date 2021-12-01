package com.oshovskii.practice.leetcode.easy.lesson16;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                moveElements(nums, i);
                count++;
            }
        }
        return nums.length - count;
    }

    private void moveElements(int[] nums, int position) {
        for (int i = position; i < nums.length; i++) {
            nums[i] = nums[i + 1];
            nums[i + 1] = 0;
        }
    }


    public int removeElementFaster(int[] nums, int val) {
        int count = 0;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (nums[end] == val) {
                end--;
            } else if (nums[start] == val) {
                nums[start] = nums[end];
                end--;
            } else {
                count++;
                start++;
            }
        }
        return count;
    }
}
