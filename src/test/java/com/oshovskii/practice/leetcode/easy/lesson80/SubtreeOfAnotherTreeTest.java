package com.oshovskii.practice.leetcode.easy.lesson80;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SubtreeOfAnotherTreeTest {

    private SubtreeOfAnotherTreeSolution subtreeOfAnotherTreeClass;

    @BeforeEach
    public void init() {
        subtreeOfAnotherTreeClass = new SubtreeOfAnotherTreeSolution();
    }

    @Test
    void  subtreeOfAnotherTreeClass_1() {
        // Call and Verify
        assertTrue(subtreeOfAnotherTreeClass.isSubtree(
                new TreeNode(3,
                        new TreeNode(4, new TreeNode(1), new TreeNode(2)),
                        new TreeNode(5)
                ),

                new TreeNode(4, new TreeNode(1), new TreeNode(2))));
    }


    @Test
    void  subtreeOfAnotherTreeClass_2() {
        // Call and Verify
        assertFalse(subtreeOfAnotherTreeClass.isSubtree(
                new TreeNode(3,
                        new TreeNode(4, new TreeNode(1), new TreeNode(2, new TreeNode(0), null)),
                        new TreeNode(5)
                ),

                new TreeNode(4, new TreeNode(1), new TreeNode(2))));
    }

    @Test
    void  subtreeOfAnotherTreeClass_1_another_solution() {
        // Call and Verify
        assertTrue(subtreeOfAnotherTreeClass.isSubtree2(
                new TreeNode(3,
                        new TreeNode(4, new TreeNode(1), new TreeNode(2)),
                        new TreeNode(5)
                ),

                new TreeNode(4, new TreeNode(1), new TreeNode(2))));
    }


    @Test
    void  subtreeOfAnotherTreeClass_4_another_solution() {
        // Call and Verify
        assertFalse(subtreeOfAnotherTreeClass.isSubtree2(
                new TreeNode(3,
                        new TreeNode(4, new TreeNode(1), new TreeNode(2, new TreeNode(0), null)),
                        new TreeNode(5)
                ),

                new TreeNode(4, new TreeNode(1), new TreeNode(2))));
    }

}
