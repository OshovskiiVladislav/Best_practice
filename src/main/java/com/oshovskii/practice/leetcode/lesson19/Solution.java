package com.oshovskii.practice.leetcode.lesson19;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int count = 0;
        int majorityElement = 0;
        int countTwo = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                if (count >= countTwo) {
                   majorityElement = nums[i];
                   countTwo = count;
                }
            } else {
                count = 0;
            }
        }
        return majorityElement;
    }

    public int majorityElementHashMap(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int majorityElement = 0;
        int result = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
            } else {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
        }
        for (Integer i : hashMap.keySet()) {
            if (hashMap.get(i) > majorityElement) {
                majorityElement = hashMap.get(i);
                result = i;
            }
        }
        return result;
    }
}
