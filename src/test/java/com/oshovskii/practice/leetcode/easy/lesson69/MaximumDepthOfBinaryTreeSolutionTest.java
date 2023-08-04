package com.oshovskii.practice.leetcode.easy.lesson69;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfBinaryTreeSolutionTest {
    MaximumDepthOfBinaryTreeSolution maximumDepthOfBinaryTreeClass;

    @BeforeEach
    public void init() {
        maximumDepthOfBinaryTreeClass = new MaximumDepthOfBinaryTreeSolution();
    }
    @Test
    void SymmetricTreeTest_1() {
        // root = [1,null,2]
        assertEquals(2, maximumDepthOfBinaryTreeClass.maxDepth(
                new TreeNode(1, null, new TreeNode(2))));
    }

    @Test
    void SymmetricTreeTest_2() {
       assertEquals(3, maximumDepthOfBinaryTreeClass.maxDepth(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3, null, new TreeNode(5)))));
    }
}
