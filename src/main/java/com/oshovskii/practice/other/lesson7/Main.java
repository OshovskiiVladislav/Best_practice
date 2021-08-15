package com.oshovskii.practice.other.lesson7;

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode();
        listNode1.setVal(1);
        ListNode listNode2 = new ListNode();
        listNode2.setVal(2);
        ListNode listNode3 = new ListNode();
        listNode3.setVal(3);
        ListNode listNode4 = new ListNode();
        listNode4.setVal(4);

        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);

        System.out.println(printNodesFrom(listNode1));
        System.out.println(printNodesFrom(reverseListNode(listNode1)));
    }

    public static ListNode reverseListNode(ListNode head) {
        ListNode current = new ListNode();
        current.setVal(head.getVal());
        current.setNext(head.getNext());

        ListNode newHead = new ListNode();
        ListNode newCurrent = new ListNode();
        newCurrent.setNext(null);

        while (current != null) {
            newCurrent.setVal(current.getVal());
            if (current.hasNext()) {
                newHead = new ListNode();
                newHead.setNext(newCurrent);
                newCurrent = newHead;
            }
            current = current.getNext();
        }
        return newHead;
    }

    public static String printNodesFrom(ListNode node) {
        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node).append(" -> ");
            node = node.getNext();
        }
        builder.setLength(builder.length() - 4);
        builder.append(" -> null");
        return builder.toString();
    }
}


