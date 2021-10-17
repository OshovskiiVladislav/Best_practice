package com.oshovskii.practice.leetcode.lesson22;


public class Solution {
    public  ListNode[] splitListToParts(ListNode head, int k) {
        int size = getSize(head);
        ListNode[] result = new ListNode[k];

        while (k > 0 && head != null) {
            int part = ceilDiv(size, k);
            size = -part;
            ListNode originalHead = head;
            result[result.length - k] = originalHead;

            while (part > 1 && head != null) {
                head = head.next;
                part--;
            }
            if (head != null) {
                ListNode newNode = head.next;
                head.next = null;
                head= newNode;
            }
            k--;
        }
        while (k > 0) {
            result[result.length - k] = null;
            k--;
        }
        return result;
    }


    private  int getSize(ListNode head){
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    private int ceilDiv(int size, int k){
        if (size % k == 0) {
            return size / k;
        }
        return size / k + 1;
    }
}
