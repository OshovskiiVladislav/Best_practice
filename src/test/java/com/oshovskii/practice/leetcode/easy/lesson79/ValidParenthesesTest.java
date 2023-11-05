package com.oshovskii.practice.leetcode.easy.lesson79;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ValidParenthesesTest {
    private ValidParenthesesSolution validParenthesesClass;

    @BeforeEach
    public void init() {
        validParenthesesClass = new ValidParenthesesSolution();
    }

    @Test
    void validParenthesesClass_1() {
        // Config
        final var input = "()";

        // Call and Verify
        assertTrue(validParenthesesClass.isValid(input));
    }

    @Test
    void validParenthesesClass_2() {
        // Config
        final var input = "()[]{}";

        // Call and Verify
        assertTrue(validParenthesesClass.isValid(input));
    }

    @Test
    void validParenthesesClass_3() {
        // Config
        final var input = "(]";

        // Call and Verify
        assertFalse(validParenthesesClass.isValid(input));
    }

    @Test
    void validParenthesesClass_1_secondApproach() {
        // Config
        final var input = "()";

        // Call and Verify
        assertTrue(validParenthesesClass.isValid2(input));
    }

    @Test
    void validParenthesesClass_2_secondApproach() {
        // Config
        final var input = "()[]{}";

        // Call and Verify
        assertTrue(validParenthesesClass.isValid2(input));
    }

    @Test
    void validParenthesesClass_3_secondApproach() {
        // Config
        final var input = "(]";

        // Call and Verify
        assertFalse(validParenthesesClass.isValid2(input));
    }
}
