package com.oshovskii.practice.leetcode.easy.lesson26;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0 && arr[j] == 0) {
                    return true;
                }
                if (arr[i] != 0 && (arr[i] == arr[j] * 2 || arr[j] == arr[i] * 2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
