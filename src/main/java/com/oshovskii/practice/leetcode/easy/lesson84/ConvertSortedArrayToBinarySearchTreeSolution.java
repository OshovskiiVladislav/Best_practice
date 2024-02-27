package com.oshovskii.practice.leetcode.easy.lesson84;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
 */
public class ConvertSortedArrayToBinarySearchTreeSolution {
    TreeNode answer;

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        answer = convertToBinaryTree(nums, nums.length, 0);
        return answer;
    }

    private TreeNode convertToBinaryTree(int[] nums, int i, int j) {
        if (i > j) {
            return null;
        }
        int mid = i - (i - j) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = convertToBinaryTree(nums, i, mid - 1);
        treeNode.right = convertToBinaryTree(nums, mid + 1, j);
        return treeNode;
    }

    public TreeNode sortedArrayToBSTWithJavaSlice(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int mid = nums.length / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        int[] leftNums = new int[mid];
        System.arraycopy(nums, 0, leftNums, 0, nums.length / 2);
        int[] rightNums = new int[nums.length - (mid + 1)];
        System.arraycopy(nums, mid + 1, rightNums, 0, nums.length - (mid + 1));
        treeNode.left = sortedArrayToBST(leftNums);
        treeNode.right = sortedArrayToBST(rightNums);
        return treeNode;
    }

}
