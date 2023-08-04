package com.oshovskii.practice.leetcode.easy.lesson31;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    void maxSubArray() {
        assertEquals(6,
                solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

        assertEquals(23,
                solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));

        assertEquals(-100,
                solution.maxSubArray(new int[]{-100, -1000}));

        assertEquals(0,
                solution.maxSubArray(new int[]{0}));
    }

    @Test
    void maxSubArrayKadaneAlgorithm() {
        assertEquals(6,
                solution.maxSubArrayKadaneAlgorithm(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

        assertEquals(23,
                solution.maxSubArrayKadaneAlgorithm(new int[]{5, 4, -1, 7, 8}));

        assertEquals(-100,
                solution.maxSubArrayKadaneAlgorithm(new int[]{-100, -1000}));

        assertEquals(0,
                solution.maxSubArrayKadaneAlgorithm(new int[]{0}));
    }
}
