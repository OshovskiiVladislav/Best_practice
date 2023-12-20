package com.oshovskii.practice.leetcode.easy.lesson81;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    private PerfectNumber perfectNumber;

    @BeforeEach
    void setUp() {
        perfectNumber = new PerfectNumber();
    }

    @Test
    void checkPerfectNumber_1() {
        // Config
        final var sourceNum = 28;

        // Call and Verify
        assertTrue(perfectNumber.checkPerfectNumber(sourceNum));
    }

    @Test
    void checkPerfectNumber_2() {
        // Config
        final var sourceNum = 7;

        // Call and Verify
        assertFalse(perfectNumber.checkPerfectNumber(sourceNum));
    }

    @Test
    void checkPerfectNumber_3() {
        // Config
        final var sourceNum = 1;

        // Call and Verify
        assertFalse(perfectNumber.checkPerfectNumber(sourceNum));
    }

    @Test
    void checkPerfectNumber_another_1() {
        // Config
        final var sourceNum = 28;

        // Call and Verify
        assertTrue(perfectNumber.checkPerfectNumberIntuition(sourceNum));
    }

    @Test
    void checkPerfectNumber_another_2() {
        // Config
        final var sourceNum = 7;

        // Call and Verify
        assertFalse(perfectNumber.checkPerfectNumberIntuition(sourceNum));
    }

    @Test
    void checkPerfectNumber_another_3() {
        // Config
        final var sourceNum = 1;

        // Call and Verify
        assertFalse(perfectNumber.checkPerfectNumberIntuition(sourceNum));
    }
}
