package com.oshovskii.practice.other.lesson12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrtTests {
    @Test
    void basicTests() {
        assertEquals(3, Sqrt.calculateSqrt(9));
        assertEquals(2, Sqrt.calculateSqrt(4));
        assertEquals(2, Sqrt.calculateSqrt(5));
    }
}
