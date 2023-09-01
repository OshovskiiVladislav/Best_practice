package com.oshovskii.practice.leetcode.hard.lesson76;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NQueensIITest {

    private NQueensIISolution nQueensIIClass;

    @BeforeEach
    public void init() {
        nQueensIIClass = new NQueensIISolution();
    }


    @Test
    void totalNQueens_size_4x4() {
        // Config
        final var input = 4;
        final var expectedOutput = 2;

        // Call and Verify
        int actual = nQueensIIClass.totalNQueens(input);

        assertEquals(expectedOutput, actual);
    }

    @Test
    void totalNQueens_size_1x1() {
        // Config
        final var input = 1;
        final var expectedOutput = 1;

        // Call and Verify
        int actual = nQueensIIClass.totalNQueens(input);

        assertEquals(expectedOutput, actual);
    }

}
