package com.oshovskii.practice.leetcode.easy.Lesson41;

import java.util.ArrayList;
import java.util.List;

class MinStackOptimized {
    private List<Integer> stack = new ArrayList();
    private List<Integer> stackWithMins = new ArrayList(); //to reduce the time complexity of finding min element

    public MinStackOptimized() {}

    public void push(int val) {
        if (stackWithMins.isEmpty()) {
            stackWithMins.add(val);
        } else if (val <= stackWithMins.get(stackWithMins.size()-1)) {
            stackWithMins.add(val);
        }

        stack.add(val);
    }

    public void pop() {
        int poppedValue = stack.remove(stack.size()-1);
        int minValue = stackWithMins.get(stackWithMins.size()-1);

        if (poppedValue == minValue) {
            stackWithMins.remove(stackWithMins.size()-1);
        }
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int getMin() {
        return stackWithMins.get(stackWithMins.size()-1);
    }
}