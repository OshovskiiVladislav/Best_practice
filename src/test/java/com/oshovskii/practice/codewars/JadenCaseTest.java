package com.oshovskii.practice.codewars;

import com.oshovskii.practice.codewars.lesson1.JadenCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class JadenCaseTest {

    JadenCase jadenCase = new JadenCase();

    @Test
    void test() {
        assertEquals(
                "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"),
                "toJadenCase doesn't return a valide JadenCase String! try again please :)");
    }

    @Test
    void testNullArg() {
        assertNull(jadenCase.toJadenCase(null),
                "Must return null when the arg is null");
    }

    @Test
    void testEmptyArg() {
        assertNull(jadenCase.toJadenCase(""),
                "Must return null when the arg is empty string");
    }

}
