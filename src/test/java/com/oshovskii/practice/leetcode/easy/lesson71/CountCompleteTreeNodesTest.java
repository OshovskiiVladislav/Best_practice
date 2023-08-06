package com.oshovskii.practice.leetcode.easy.lesson71;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountCompleteTreeNodesTest {

    CountCompleteTreeNodesSolution countCompleteTreeNodesClass;

    @BeforeEach
    public void init() {
        countCompleteTreeNodesClass = new CountCompleteTreeNodesSolution();
    }

    @Test
    void  countCompleteTreeNodes_1() {
        // Input: root = [1,2,3,4,5,6] | Output: 6
        assertEquals(6, countCompleteTreeNodesClass.countNodes(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null))
        ));
    }

    @Test
    void  countCompleteTreeNodes_2() {
        assertEquals(0, countCompleteTreeNodesClass.countNodes(null));
    }

    @Test
    void  countCompleteTreeNodes_3() {
        assertEquals(1, countCompleteTreeNodesClass.countNodes(new TreeNode(1)));
    }

    @Test
    void  countCompleteTreeNodes_Recursive_1() {
        // Input: root = [1,2,3,4,5,6] | Output: 6
        assertEquals(6, countCompleteTreeNodesClass.countNodesRecursive(new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null))
        ));
    }

    @Test
    void  countCompleteTreeNodes_Recursive_2() {
        assertEquals(0, countCompleteTreeNodesClass.countNodesRecursive(null));
    }

    @Test
    void  countCompleteTreeNodes_Recursive_3() {
        assertEquals(1, countCompleteTreeNodesClass.countNodesRecursive(new TreeNode(1)));
    }
}
