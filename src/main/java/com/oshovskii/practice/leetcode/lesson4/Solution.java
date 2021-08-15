package com.oshovskii.practice.leetcode.lesson4;

public class Solution {

    public static int maxArea(int[] height) {
        int value = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (value <= (Math.abs(i - j)) * Math.min(height[i], height[j])) {
                    value = (Math.abs(i - j)) * Math.min(height[i], height[j]);
                }
            }
        }
        return value;
    }

    public static int maxAreaOptimize(int[] height) {
        int a_pointer = 0;
        int b_pointer = height.length - 1;
        int max_area = 0;

        while (a_pointer < b_pointer) {
            if (height[a_pointer] < height[b_pointer]) {
                max_area = Math.max(max_area, height[a_pointer] * (b_pointer - a_pointer));
                a_pointer++;
            } else {
                max_area = Math.max(max_area, height[b_pointer] * (b_pointer - a_pointer));
                b_pointer--;
            }

        }
        return max_area;
    }

}
