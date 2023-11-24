package com.oshovskii.practice.leetcode.easy.lesson80;

import java.util.LinkedList;
import java.util.Queue;

public class SubtreeOfAnotherTreeSolution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (isSame(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSame(TreeNode nodeRoot, TreeNode subNode) {
        if (nodeRoot == null && subNode == null) {
            return true;
        }
        if (nodeRoot == null || subNode == null) {
            return false;
        }
        if (nodeRoot.val != subNode.val) {
            return false;
        }
        return isSame(nodeRoot.right, subNode.right) && isSame(nodeRoot.left, subNode.left);
    }

    private boolean isSameTree2(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(t1);
        queue.add(t2);

        while (!queue.isEmpty()) {
            TreeNode n1 = queue.poll();
            TreeNode n2 = queue.poll();
            if (n1 == null && n2 == null) {
                continue;
            }
            if (n1 == null || n2 == null) {
                return false;
            }
            if (n1.val != n2.val) {
                return false;
            }
            queue.add(n1.left);
            queue.add(n2.left);

            queue.add(n1.right);
            queue.add(n2.right);
        }
        return true;
    }


    public boolean isSubtree2(TreeNode root, TreeNode subRoot) {

        if (root == null && subRoot == null) {
            return true;
        } else if (root != null && subRoot == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                continue;
            }
            if (isSameTree2(node, subRoot)) {
                return true;
            }
            queue.add(node.left);
            queue.add(node.right);
        }
        return false;
    }

}
