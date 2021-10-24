package com.oshovskii.practice.leetcode.easy.lesson31;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void maxSubArray() {
        Assert.assertEquals(6,
                solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

        Assert.assertEquals(23,
                solution.maxSubArray(new int[]{5,4,-1,7,8}));

        Assert.assertEquals(-100,
                solution.maxSubArray(new int[]{-100, -1000}));

        Assert.assertEquals(0,
                solution.maxSubArray(new int[]{0}));
    }

    @Test
    public void maxSubArrayKadaneAlgorithm() {
        Assert.assertEquals(6,
                solution.maxSubArrayKadaneAlgorithm(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

        Assert.assertEquals(23,
                solution.maxSubArrayKadaneAlgorithm(new int[]{5,4,-1,7,8}));

        Assert.assertEquals(-100,
                solution.maxSubArrayKadaneAlgorithm(new int[]{-100, -1000}));

        Assert.assertEquals(0,
                solution.maxSubArrayKadaneAlgorithm(new int[]{0}));
    }
}
