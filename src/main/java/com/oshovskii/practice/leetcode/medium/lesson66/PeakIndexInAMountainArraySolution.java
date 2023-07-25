package com.oshovskii.practice.leetcode.medium.lesson66;


/**
 * 852. Peak Index in a Mountain Array
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 */
public class PeakIndexInAMountainArraySolution {
    public static void main(String[] args) {
        PeakIndexInAMountainArraySolution solution = new PeakIndexInAMountainArraySolution();
        System.out.println("Test №1. The peak index of the mountain array is: "
                + solution.peakIndexInMountainArray(new int[]{0, 1, 0}));
        System.out.println("Test №2. The peak index of the mountain array is: "
                + solution.peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
        System.out.println("Test №3. The peak index of the mountain array is: "
                + solution.peakIndexInMountainArray(new int[]{0, 10, 5, 2}));
    }

    public int peakIndexInMountainArray(int[] arr) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        int middleIndex;

        while (lowIndex < highIndex) {
            middleIndex = lowIndex + (highIndex - lowIndex) / 2;
            if (arr[middleIndex] >= arr[middleIndex + 1]) {
                highIndex = middleIndex;
            }
            else {
                lowIndex = middleIndex + 1;
            }
        }
        return lowIndex;
    }

}



