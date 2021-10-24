package com.oshovskii.practice.leetcode.medium.lesson22;


public class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 1;
        ListNode originalHead = head;

        if (head == null) {
            return new ListNode[k];
        }

        if (k == 1) {
            return new ListNode[] {head};
        }

        while (head.next != null) {
            size++;
            head = head.next;
        }

        head = originalHead;
        ListNode[] result = new ListNode[k];

        int[] parts = findParts(size, k);
        ListNode nextHead = head;

        for (int i = 0; i < k; i++) {
            result[i] = nextHead;
            int count = 0;
            ListNode last = head;
            while (count != parts[i]) {
                last = head;
                head = head.next;
                count++;
            }
            nextHead = head;
            if (last != null) {
                last.next = null;
            }

        }

        if (size < k) {
            for (int i = size; i < k; i++) {
                result[i] = null;
            }
        }

        return result;
    }

    public static int[] findParts(int number, int parts) {
        int[] result = new int[parts];
        int biggerParts = number % parts;
        int bigger = 1 + number / parts;
        for (int i = 0; i < biggerParts; i++) {
            result[i] = bigger;
        }
        for (int i = biggerParts; i < parts; i++) {
            result[i] = bigger - 1;
        }
        return result;
    }
}