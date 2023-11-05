package com.oshovskii.practice.leetcode.easy.lesson79;

import java.util.Stack;


public class ValidParenthesesSolution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character character : s.toCharArray()) {
            if (character == '(' || character == '{' || character == '[') {
                stack.push(character);
            }

            if (stack.isEmpty()) {
                return false;
            }

            if (character == ')' && stack.pop() != '(') {
                return false;
            }
            if (character == '}' && stack.pop() != '{') {
                return false;
            }
            if (character == ']' && stack.pop() != '[') {
                return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == '(') {
                stack.push(')');
            } else if (x == '{') {
                stack.push('}');
            } else if (x == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != x) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
