package com.oshovskii.practice.leetcode.medium.lesson21;

import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.') {
                    if (!hashSet.add(current + " found in row " + i) ||
                        !hashSet.add(current + " found in column " + j) ||
                        !hashSet.add(current + " found in sub box " + i/3 + "-" + j/3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
