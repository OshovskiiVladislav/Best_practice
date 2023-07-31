package com.oshovskii.practice.leetcode.easy.lesson69;

import org.junit.Assert;
import org.junit.Test;

public class MaximumDepthOfBinaryTreeSolutionTest {
    MaximumDepthOfBinaryTreeSolution maximumDepthOfBinaryTreeClass = new MaximumDepthOfBinaryTreeSolution();

    @Test
    public void SymmetricTreeTest_1() {
        // root = [1,null,2]
        Assert.assertEquals(2, maximumDepthOfBinaryTreeClass.maxDepth(
                new TreeNode(1, null, new TreeNode(2))));
    }

    @Test
    public void SymmetricTreeTest_2() {
        Assert.assertEquals(3, maximumDepthOfBinaryTreeClass.maxDepth(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3, null, new TreeNode(5)))));
    }
}
