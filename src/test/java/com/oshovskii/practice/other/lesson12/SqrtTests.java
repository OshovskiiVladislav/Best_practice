package com.oshovskii.practice.other.lesson12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtTests {
    @Test
    public void basicTests() {
        assertEquals(3, Sqrt.calculateSqrt(9));
        assertEquals(2, Sqrt.calculateSqrt(4));
        assertEquals(2, Sqrt.calculateSqrt(5));
    }
}
