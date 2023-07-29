package com.oshovskii.practice.leetcode.easy.lesson68;

import org.junit.Assert;
import org.junit.Test;

public class SymmetricTreeSolutionTest {

    SymmetricTreeSolution symmetricTreeClass = new SymmetricTreeSolution();

    @Test
    public void SymmetricTreeTest_1() {
        // root = [1,2,2,3,4,4,3]
        Assert.assertTrue(symmetricTreeClass.isSymmetric(
                new TreeNode(1,
                        new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                        new TreeNode(2, new TreeNode(4), new TreeNode(3)))
        ));
    }

    @Test
    public void SymmetricTreeTest_1_recursion() {
        // root = [1,2,2,3,4,4,3]
        Assert.assertTrue(symmetricTreeClass.isSymmetricRecursion(
                new TreeNode(1,
                        new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                        new TreeNode(2, new TreeNode(4), new TreeNode(3)))
        ));
    }


    @Test
    public void SymmetricTreeTest_2() {
        // root = [1,2,2,null,3,null,3]
        Assert.assertFalse(symmetricTreeClass.isSymmetric(
                new TreeNode(1,
                        new TreeNode(2, null, new TreeNode(3)),
                        new TreeNode(2, null, new TreeNode(3)))
        ));
    }

    @Test
    public void SymmetricTreeTest_2_recursion() {
        // root = [1,2,2,null,3,null,3]
        Assert.assertFalse(symmetricTreeClass.isSymmetricRecursion(
                new TreeNode(1,
                        new TreeNode(2, null, new TreeNode(3)),
                        new TreeNode(2, null, new TreeNode(3)))
        ));
    }

    @Test
    public void SymmetricTreeTest_3() {
        // root = [1,0]
        Assert.assertFalse(symmetricTreeClass.isSymmetric(new TreeNode(1, new TreeNode(0), null)));
    }

    @Test
    public void SymmetricTreeTest_3_recursion() {
        // root = [1,0]
        Assert.assertFalse(symmetricTreeClass.isSymmetricRecursion(new TreeNode(1, new TreeNode(0), null)));
    }


    @Test
    public void SymmetricTreeTest_4() {
        // root = [1]
        Assert.assertTrue(symmetricTreeClass.isSymmetric(new TreeNode(1, null, null)));
    }

    @Test
    public void SymmetricTreeTest_4_recursion() {
        // root = [1]
        Assert.assertTrue(symmetricTreeClass.isSymmetricRecursion(new TreeNode(1, null, null)));
    }

    @Test
    public void SymmetricTreeTest_5() {
        // root = [1,2,2]
        Assert.assertTrue(symmetricTreeClass.isSymmetric(new TreeNode(1, new TreeNode(2), new TreeNode(2))));
    }

    @Test
    public void SymmetricTreeTest_5_recursion() {
        // root = [1,2,2]
        Assert.assertTrue(symmetricTreeClass.isSymmetricRecursion(new TreeNode(1, new TreeNode(2), new TreeNode(2))));
    }

    @Test
    public void SymmetricTreeTest_6() {
        // root = [2,3,3,4,5,5]
        Assert.assertFalse(symmetricTreeClass.isSymmetric(new TreeNode(2,
                new TreeNode(3, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(5), null))
        ));
    }

    @Test
    public void SymmetricTreeTest_6_recursion() {
        // root = [2,3,3,4,5,5]
        Assert.assertFalse(symmetricTreeClass.isSymmetricRecursion(new TreeNode(2,
                new TreeNode(3, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(5), null))
        ));
    }

    @Test
    public void SymmetricTreeTest_7() {
        // root = [1,2,2,3,4,4,3]
        Assert.assertTrue(symmetricTreeClass.isSymmetric(new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)))
        ));
    }

    @Test
    public void SymmetricTreeTest_7_recursion() {
        // root = [1,2,2,3,4,4,3]
        Assert.assertTrue(symmetricTreeClass.isSymmetricRecursion(new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)))
        ));
    }
}
