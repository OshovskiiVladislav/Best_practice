package com.oshovskii.practice.leetcode.easy.lesson68;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SymmetricTreeSolutionTest {

    SymmetricTreeSolution symmetricTreeClass;

    @BeforeEach
    public void init() {
        symmetricTreeClass = new SymmetricTreeSolution();
    }

    @Test
    void SymmetricTreeTest_1() {
        // root = [1,2,2,3,4,4,3]
       assertTrue(symmetricTreeClass.isSymmetric(
                new TreeNode(1,
                        new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                        new TreeNode(2, new TreeNode(4), new TreeNode(3)))
        ));
    }

    @Test
    void SymmetricTreeTest_1_recursion() {
        // root = [1,2,2,3,4,4,3]
        assertTrue(symmetricTreeClass.isSymmetricRecursion(
                new TreeNode(1,
                        new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                        new TreeNode(2, new TreeNode(4), new TreeNode(3)))
        ));
    }


    @Test
    void SymmetricTreeTest_2() {
        // root = [1,2,2,null,3,null,3]
        assertFalse(symmetricTreeClass.isSymmetric(
                new TreeNode(1,
                        new TreeNode(2, null, new TreeNode(3)),
                        new TreeNode(2, null, new TreeNode(3)))
        ));
    }

    @Test
    void SymmetricTreeTest_2_recursion() {
        // root = [1,2,2,null,3,null,3]
        assertFalse(symmetricTreeClass.isSymmetricRecursion(
                new TreeNode(1,
                        new TreeNode(2, null, new TreeNode(3)),
                        new TreeNode(2, null, new TreeNode(3)))
        ));
    }

    @Test
    void SymmetricTreeTest_3() {
        // root = [1,0]
        assertFalse(symmetricTreeClass.isSymmetric(new TreeNode(1, new TreeNode(0), null)));
    }

    @Test
    void SymmetricTreeTest_3_recursion() {
        // root = [1,0]
        assertFalse(symmetricTreeClass.isSymmetricRecursion(new TreeNode(1, new TreeNode(0), null)));
    }


    @Test
    void SymmetricTreeTest_4() {
        // root = [1]
        assertTrue(symmetricTreeClass.isSymmetric(new TreeNode(1, null, null)));
    }

    @Test
    void SymmetricTreeTest_4_recursion() {
        // root = [1]
        assertTrue(symmetricTreeClass.isSymmetricRecursion(new TreeNode(1, null, null)));
    }

    @Test
    void SymmetricTreeTest_5() {
        // root = [1,2,2]
        assertTrue(symmetricTreeClass.isSymmetric(new TreeNode(1, new TreeNode(2), new TreeNode(2))));
    }

    @Test
    void SymmetricTreeTest_5_recursion() {
        // root = [1,2,2]
        assertTrue(symmetricTreeClass.isSymmetricRecursion(new TreeNode(1, new TreeNode(2), new TreeNode(2))));
    }

    @Test
    void SymmetricTreeTest_6() {
        // root = [2,3,3,4,5,5]
        assertFalse(symmetricTreeClass.isSymmetric(new TreeNode(2,
                new TreeNode(3, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(5), null))
        ));
    }

    @Test
    void SymmetricTreeTest_6_recursion() {
        // root = [2,3,3,4,5,5]
        assertFalse(symmetricTreeClass.isSymmetricRecursion(new TreeNode(2,
                new TreeNode(3, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(5), null))
        ));
    }

    @Test
    void SymmetricTreeTest_7() {
        // root = [1,2,2,3,4,4,3]
        assertTrue(symmetricTreeClass.isSymmetric(new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)))
        ));
    }

    @Test
    void SymmetricTreeTest_7_recursion() {
        // root = [1,2,2,3,4,4,3]
        assertTrue(symmetricTreeClass.isSymmetricRecursion(new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)))
        ));
    }
}
