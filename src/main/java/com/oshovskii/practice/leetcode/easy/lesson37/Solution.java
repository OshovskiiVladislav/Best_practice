package com.oshovskii.practice.leetcode.easy.lesson37;

public class Solution {
    public void deleteNode(ListNode node) {
        while (node.next.next != null) {
           node.val = node.next.val;
           node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }
}
