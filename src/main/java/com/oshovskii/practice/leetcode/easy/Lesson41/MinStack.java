package com.oshovskii.practice.leetcode.easy.Lesson41;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    private List<Integer> list;
    private Integer min;

    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int val) {
        if (val < min) {
            min = val;
        }
        list.add(val);
    }

    public void pop() {
        Integer element = list.remove(list.size() - 1);
        if (element == min) {

        }
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return min;
    }
}
