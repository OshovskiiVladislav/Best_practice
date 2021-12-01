package com.oshovskii.practice.leetcode.easy.lesson34;

import java.util.Arrays;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, resultTail = n + m - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[resultTail--] = nums1[tail1] > nums2[tail2] ? nums1[tail1--] : nums2[tail2--];
        }

        if (tail2 >= 0) {
            System.arraycopy(nums2, 0, nums1, 0, tail2 + 1);
        }
    }

    public void mergeFaster(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
