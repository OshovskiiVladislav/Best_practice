package com.oshovskii.practice.leetcode.easy.lesson18;

import java.util.Arrays;

public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1] && count != 1) {
                count = 0;
            }
            if (nums[i] != nums[i + 1] && count == 1) {
                return nums[i];
            } else {
                count++;
            }
        }
        return nums[nums.length - 1];
    }
}
