package com.oshovskii.practice.leetcode.easy.lesson46;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] intersection = new int[Math.max(nums1.length, nums2.length)];
        int count = 0;

        for(int n: nums1)
            map.put(n, map.getOrDefault(n, 0) + 1);

        for(int n: nums2) {
            if(map.containsKey(n)) {
                int x = map.get(n);
                if (x > 0) {
                    intersection[count] = n;
                    count++;
                }
                map.replace(n, x-1);
            }
        }
        return Arrays.copyOf(intersection, count);
    }
}