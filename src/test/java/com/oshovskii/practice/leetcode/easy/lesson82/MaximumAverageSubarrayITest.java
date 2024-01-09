package com.oshovskii.practice.leetcode.easy.lesson82;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayITest {

    private MaximumAverageSubarrayISolution maximumAverageSubarrayIClass;

    @BeforeEach
    void setUp() {
        maximumAverageSubarrayIClass = new MaximumAverageSubarrayISolution();
    }

    @Test
    void findMaxAverage_1() {
        // Config
        final var sourceNums = new int[]{1, 12, -5, -6, 50, 3};
        final var k = 4;
        final var expectedOutput = 12.75000;

        // Call and Verify
        var actual = maximumAverageSubarrayIClass.findMaxAverage(sourceNums, k);
        assertEquals(expectedOutput, actual);
    }

    @Test
    void findMaxAverage_2() {
        // Config
        final var sourceNums = new int[]{5};
        final var k = 1;
        final var expectedOutput = 5.00000;

        // Call and Verify
        var actual = maximumAverageSubarrayIClass.findMaxAverage(sourceNums, k);
        assertEquals(expectedOutput, actual);
    }

    @Test
    void findMaxAverage_3() {
        // Config
        final var sourceNums = new int[]{0, 1, 1, 3, 3};
        final var k = 4;
        final var expectedOutput = 2.00000;

        // Call and Verify
        var actual = maximumAverageSubarrayIClass.findMaxAverage(sourceNums, k);
        assertEquals(expectedOutput, actual);
    }

    @Test
    void findMaxAverage_1_faster() {
        // Config
        final var sourceNums = new int[]{1, 12, -5, -6, 50, 3};
        final var k = 4;
        final var expectedOutput = 12.75000;

        // Call and Verify
        var actual = maximumAverageSubarrayIClass.findMaxAverageFaster(sourceNums, k);
        assertEquals(expectedOutput, actual);
    }

    @Test
    void findMaxAverage_2_faster() {
        // Config
        final var sourceNums = new int[]{5};
        final var k = 1;
        final var expectedOutput = 5.00000;

        // Call and Verify
        var actual = maximumAverageSubarrayIClass.findMaxAverageFaster(sourceNums, k);
        assertEquals(expectedOutput, actual);
    }

    @Test
    void findMaxAverage_3_faster() {
        // Config
        final var sourceNums = new int[]{0, 1, 1, 3, 3};
        final var k = 4;
        final var expectedOutput = 2.00000;

        // Call and Verify
        var actual = maximumAverageSubarrayIClass.findMaxAverageFaster(sourceNums, k);
        assertEquals(expectedOutput, actual);
    }

}
