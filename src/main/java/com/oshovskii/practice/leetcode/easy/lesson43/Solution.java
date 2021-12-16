package com.oshovskii.practice.leetcode.easy.lesson43;

public class Solution {
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        int countZero = 0;
        for (int i = 0; i < nums.length - countZero; i++) {
            if (nums[i] == 0) {
                System.arraycopy(nums, i + 1, nums, i, nums.length - 1 - i);
                nums[nums.length - 1] = 0;
                countZero++;
                i--;
            }
        }
    }

    public void moveZeroesOptimized(int[] nums) {
        int k = 0,i = 0;
        while(i < nums.length){
            if(nums[i] != 0)
                nums[k++] = nums[i];
            i++;
        }
        while(k < nums.length)
            nums[k++] = 0;

    }
}
