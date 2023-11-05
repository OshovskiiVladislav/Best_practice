package com.oshovskii.practice.leetcode.easy.lesson78;

import java.util.ArrayList;
import java.util.List;

/**
 * 401. Binary Watch
 * https://leetcode.com/problems/binary-watch/description/
 */
public class BinaryWatchSolution {
    public static void main(String[] args) {
        System.out.println(readBinaryWatch(9));
    }

    public static List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> result = new ArrayList<>();
        for (int hour = 0; hour <= 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
                    if (minute < 10) {
                        result.add(hour + ":0" + minute);
                    } else {
                        result.add(hour + ":" + minute);
                    }
                }
            }
        }
        return result;
    }
}
