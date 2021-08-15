package com.oshovskii.practice.other.lesson7;

public class ListNode {
    private ListNode next;
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString() {
        return "ListNode{val = " + this.val + "}";
    }
}