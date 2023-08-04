package com.oshovskii.practice.leetcode.easy.lesson23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    void findWords() {
        assertArrayEquals(new String[]{"Alaska", "Dad"},
                solution.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));

        assertArrayEquals(new String[]{"adsdf", "sfd"},
                solution.findWords(new String[]{"adsdf", "sfd"}));
    }

    @Test
    void findWord() {
        assertArrayEquals(new String[]{"Alaska", "Dad"},
                solution.findWord(new String[]{"Hello", "Alaska", "Dad", "Peace"}));

       assertArrayEquals(new String[]{"adsdf", "sfd"},
                solution.findWord(new String[]{"adsdf", "sfd"}));
    }
}
