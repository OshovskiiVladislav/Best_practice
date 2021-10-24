package com.oshovskii.practice.leetcode.easy.lesson20;

import org.junit.Assert;
import org.junit.Test;;

public class SolutionTest {
    @Test
    public void buildArray(){
        Solution solution = new Solution();

        Assert.assertArrayEquals(new int[]{0,1,2,4,5,3},
                solution.buildArray(new int[]{0,2,1,5,3,4}));

        Assert.assertArrayEquals(new int[]{4,5,0,1,2,3},
                solution.buildArray(new int[]{5,0,1,2,3,4}));
    }
}
