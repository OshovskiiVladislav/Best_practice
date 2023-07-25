package com.oshovskii.practice.leetcode.medium.lesson59;

import java.util.Stack;

/**
 * 230. Kth Smallest Element in a BST
 */
public class KthSmallestElementInBSTSolution {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3,
                new TreeNode(1, null, new TreeNode(2, null, null)),
                new TreeNode(4, null, null));
        System.out.println(kthSmallest(treeNode, 1));

        TreeNode treeNode2 = new TreeNode(1, null, new TreeNode(2, null, null));
        System.out.println(kthSmallest(treeNode2, 2));
    }

    public static int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();

        while (true) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();
            k--;
            if (k == 0) {
                return root.val;
            }

            root = root.right;
        }
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
