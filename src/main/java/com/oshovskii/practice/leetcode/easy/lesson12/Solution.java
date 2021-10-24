package com.oshovskii.practice.leetcode.easy.lesson12;

import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
                if (map.get(i) > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicateVersionTwo(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicateVersionThree(int[] nums) {
        Set<Integer> integers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!integers.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
