package com.oshovskii.practice.leetcode.medium.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void plusOneTest() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 9},
                Solution.plusOne(new int[]{1, 2, 3, 4, 5, 6, 8}));

        assertArrayEquals(new int[]{1, 2, 3, 5, 0, 0, 0, 0, 0},
                Solution.plusOne(new int[]{1, 2, 3, 4, 9, 9, 9, 9, 9}));

        assertArrayEquals(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                Solution.plusOne(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9}));

        assertArrayEquals(
                new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7,
                        9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7},
                Solution.plusOne(
                        new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4,
                                3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6}));
    }
}

