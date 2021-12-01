package com.oshovskii.practice.leetcode.easy.lesson25;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(17, 10, 2021));
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        String[] weekArray = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return weekArray[LocalDate.of(year, month, day).getDayOfWeek().getValue() - 1];
    }

}
