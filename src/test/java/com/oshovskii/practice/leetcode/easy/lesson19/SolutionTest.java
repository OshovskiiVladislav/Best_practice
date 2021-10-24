package com.oshovskii.practice.leetcode.easy.lesson19;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
        Solution solution = new Solution();

        @Test
        public void majorityElementTest() {
            assertEquals(6, solution.majorityElement(new int[]{6, 6, 6, 7, 7}));
            assertEquals(3, solution.majorityElementHashMap(new int[]{3, 2, 3}));
        }

        @Test
        public void majorityElementHashMap() {
            assertEquals(6, solution.majorityElementHashMap(new int[]{6, 6, 6, 7, 7}));
            assertEquals(3, solution.majorityElementHashMap(new int[]{3, 2, 3}));
        }
}
