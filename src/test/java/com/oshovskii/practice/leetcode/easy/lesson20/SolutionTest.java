package com.oshovskii.practice.leetcode.easy.lesson20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    void buildArray() {
        assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3},
                solution.buildArray(new int[]{0, 2, 1, 5, 3, 4}));

        assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3},
                solution.buildArray(new int[]{5, 0, 1, 2, 3, 4}));
    }
}
