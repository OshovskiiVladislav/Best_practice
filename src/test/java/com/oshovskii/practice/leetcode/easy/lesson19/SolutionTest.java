package com.oshovskii.practice.leetcode.easy.lesson19;

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
    void majorityElementTest() {
        assertEquals(6, solution.majorityElement(new int[]{6, 6, 6, 7, 7}));
        assertEquals(3, solution.majorityElementHashMap(new int[]{3, 2, 3}));
    }

    @Test
    void majorityElementHashMap() {
        assertEquals(6, solution.majorityElementHashMap(new int[]{6, 6, 6, 7, 7}));
        assertEquals(3, solution.majorityElementHashMap(new int[]{3, 2, 3}));
    }
}
