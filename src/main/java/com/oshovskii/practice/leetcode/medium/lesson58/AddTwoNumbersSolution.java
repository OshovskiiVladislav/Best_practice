package com.oshovskii.practice.leetcode.medium.lesson58;

/**
 * 2. Add Two Numbers
 */
public class AddTwoNumbersSolution {
    public static void main(String[] args) {
        System.out.println(addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4)))
        ));

        System.out.println(addTwoNumbers(new ListNode(1), new ListNode(1)));

        System.out.println(addTwoNumbers(new ListNode(9),
                new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))))));
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode head = new ListNode(0);
        ListNode l3 = head, p1 = l1, p2 = l2;
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                c += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                c += p2.val;
                p2 = p2.next;
            }
            l3.next = new ListNode(c % 10);
            l3 = l3.next;
            c /= 10;
        }
        if (c == 1) {
            l3.next = new ListNode(1);

        }
        return head.next;
    }

    public static ListNode addTwoNumbersNotWork(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return new ListNode();
        }
        if ((l1.next == null && l1.val == 0) && (l2.next == null && l2.val == 0)) {
            return new ListNode();
        }
        if (l1.next == null && l1.val == 0) {
            return l2;
        }
        if (l2.next == null && l2.val == 0) {
            return l1;
        }
        long l1ReverseValue = 0;
        long l2ReverseValue = 0;
        long step = 1;
        while (l1.next != null) {
            l1ReverseValue = l1ReverseValue + l1.val * step;
            step = step * 10;
            l1 = l1.next;
        }
        l1ReverseValue = l1ReverseValue + l1.val * step;
        step = 1;


        while (l2.next != null) {
            l2ReverseValue = l2ReverseValue + l2.val * step;
            step = step * 10;
            l2 = l2.next;
        }

        l2ReverseValue = l2ReverseValue + l2.val * step;


        long result = l1ReverseValue + l2ReverseValue;

        if (result < 10) {
            return new ListNode((int) result, null);
        }

        ListNode head = new ListNode((int) (result % 10), new ListNode());
        ListNode resultListNode = head.next;
        long remainderDivision;
        result = result / 10;
        while (result > 9) {
            remainderDivision = result % 10;
            resultListNode = push(remainderDivision, resultListNode);
            result = result / 10;
        }
        resultListNode.val = (int) result;
        resultListNode.next = null;
        return head;
    }

    public static ListNode push(long newData, ListNode headRef) {
        headRef.val = (int) newData;
        headRef.next = new ListNode();
        return headRef.next;
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
}
