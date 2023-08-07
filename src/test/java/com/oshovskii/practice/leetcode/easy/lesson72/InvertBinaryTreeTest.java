package com.oshovskii.practice.leetcode.easy.lesson72;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvertBinaryTreeTest {

    private InvertBinaryTreeSolution invertBinaryTreeClass;

    @BeforeEach
    public void init() {
        invertBinaryTreeClass = new InvertBinaryTreeSolution();
    }


    @Test
    void invertTree_1() {
        //root = [4,2,7,1,3,6,9] | Output [4,7,2,9,6,3,1]
        assertEquals(new TreeNode(4,
                        new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                        new TreeNode(2, new TreeNode(3), new TreeNode(1))),

                invertBinaryTreeClass.invertTree(new TreeNode(4,
                        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                        new TreeNode(7, new TreeNode(6), new TreeNode(9)))));

        assertEquals(new TreeNode(4,
                        new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                        new TreeNode(2, new TreeNode(3), new TreeNode(1))),

                invertBinaryTreeClass.invertTreeWithHelper(new TreeNode(4,
                        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                        new TreeNode(7, new TreeNode(6), new TreeNode(9)))));

        assertEquals(new TreeNode(4,
                        new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                        new TreeNode(2, new TreeNode(3), new TreeNode(1))),

                invertBinaryTreeClass.invertTreeOneLine(new TreeNode(4,
                        new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                        new TreeNode(7, new TreeNode(6), new TreeNode(9)))));
    }

    @Test
    void invertTree_2() {
        //root = [2,1,3] | Output [2,3,1]
        assertEquals(new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),

                invertBinaryTreeClass.invertTree(new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(1))));

        assertEquals(new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),

                invertBinaryTreeClass.invertTreeWithHelper(new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(1))));

        assertEquals(new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),

                invertBinaryTreeClass.invertTreeOneLine(new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(1))));
    }

    @Test
    void invertTree_3() {
        //root = [] | Output []
        assertEquals(null, invertBinaryTreeClass.invertTree(null));

        assertEquals(null, invertBinaryTreeClass.invertTreeWithHelper(null));

        assertEquals(null, invertBinaryTreeClass.invertTreeOneLine(null));
    }

    @Test
    void invertTree_4() {
        //root = [1, 2] | Output [1, null, 2]
        assertEquals(new TreeNode(1, null, new TreeNode(2)),
                invertBinaryTreeClass.invertTree(new TreeNode(1, new TreeNode(2), null)));

        assertEquals(new TreeNode(1, null, new TreeNode(2)),
                invertBinaryTreeClass.invertTreeWithHelper(new TreeNode(1, new TreeNode(2), null)));

        assertEquals(new TreeNode(1, null, new TreeNode(2)),
                invertBinaryTreeClass.invertTreeOneLine(new TreeNode(1, new TreeNode(2), null)));
    }

}
