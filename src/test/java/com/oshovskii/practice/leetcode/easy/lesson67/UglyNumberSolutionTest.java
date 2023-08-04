package com.oshovskii.practice.leetcode.easy.lesson67;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumberSolutionTest {

    UglyNumberSolution uglyNumberClass;

    @BeforeEach
    public void init() {
        uglyNumberClass = new UglyNumberSolution();
    }


    @Test
    void UglyNumberTest() {
        assertFalse(UglyNumberSolution.isUgly(14));

        assertTrue(UglyNumberSolution.isUgly(8));

        assertFalse(UglyNumberSolution.isUgly(-2147483648));

        assertTrue(UglyNumberSolution.isUgly(9));
    }
}
