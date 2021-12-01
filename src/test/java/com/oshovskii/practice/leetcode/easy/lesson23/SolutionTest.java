package com.oshovskii.practice.leetcode.easy.lesson23;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void findWords() {
        Assert.assertArrayEquals(new String[]{"Alaska", "Dad"},
                solution.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));

        Assert.assertArrayEquals(new String[]{"adsdf", "sfd"},
                solution.findWords(new String[]{"adsdf", "sfd"}));
    }

    @Test
    public void findWord() {
        Assert.assertArrayEquals(new String[]{"Alaska", "Dad"},
                solution.findWord(new String[]{"Hello", "Alaska", "Dad", "Peace"}));

        Assert.assertArrayEquals(new String[]{"adsdf", "sfd"},
                solution.findWord(new String[]{"adsdf", "sfd"}));
    }
}
