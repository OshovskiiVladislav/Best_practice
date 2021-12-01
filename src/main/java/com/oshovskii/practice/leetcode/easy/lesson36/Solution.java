package com.oshovskii.practice.leetcode.easy.lesson36;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>(new ArrayList<>());
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            result.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    result.get(i).add(1);
                } else {
                    result.get(i).add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
        }

        return result;
    }
}
