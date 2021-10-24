package com.oshovskii.practice.leetcode.easy.lesson17;

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertToBase7(-54));
    }
    public static String convertToBase7(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        String sign = "";
        if (num < 0) {
            sign = "-";
        }
        num = Math.abs(num);
        while (num >= 7) {
            stringBuilder.append(num % 7);
            num = num / 7;
        }
        stringBuilder.append(num);
        return sign + stringBuilder.reverse();
    }
}
