package com.oshovskii.practice.leetcode.medium.lesson61;

public class SortColorsSolution {
    public static void main(String[] args) {
        sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }

    public static void sortColors(int[] nums) {
        int s = nums.length, k = 0;
        int[] arr = new int[s];

        for (int i = 0; i < s; i++) {
            if (nums[i] == 0)
                arr[k++] = nums[i];
        }
        for (int i = 0; i < s; i++) {
            if (nums[i] == 1)
                arr[k++] = nums[i];
        }
        for (int i = 0; i < s; i++) {
            if (nums[i] == 2)
                arr[k++] = nums[i];
        }
        for (int i = 0; i < s; i++) {
            nums[i] = arr[i];
        }
    }
}
