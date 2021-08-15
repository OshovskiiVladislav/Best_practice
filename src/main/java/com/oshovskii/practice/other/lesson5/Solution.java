package com.oshovskii.practice.other.lesson5;

public class Solution {
    public static Integer calculateSum(String input) {
        if (input.matches("[0-9]+")) {
            int value = 0;
            String[] digits = input.split("");
            for (int i = 0; i < digits.length; i++) {
                value += Integer.parseInt(digits[i]);
            }
            return value;
        } else {
            throw new NumberFormatException();
        }
    }
}
