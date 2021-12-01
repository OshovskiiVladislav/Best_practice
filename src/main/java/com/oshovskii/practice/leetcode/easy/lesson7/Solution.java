package com.oshovskii.practice.leetcode.easy.lesson7;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * O(n2) time complexity
     *
     * @param nums   - array of integers
     * @param target - integer number
     * @return int[]
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution for  defined input data!");
    }

    /**
     * O(N) time complexity
     *
     * @param nums   - array of integers
     * @param target - integer number
     * @return int[]
     */
    public int[] twoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];
            if (map.containsKey(requiredNumber) && map.get(requiredNumber) != i) {
                return new int[]{i, map.get(requiredNumber)};
            }
        }
        throw new IllegalArgumentException("No solution for  defined input data!");
    }

    /**
     * It's at least two times faster than other.
     *
     * @param nums   - array of integers
     * @param target - integer number
     * @return int[]
     */
    public int[] twoSumMaxFaster(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] response = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                response[0] = map.get(target - nums[i]);
                response[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return response;
    }
}
