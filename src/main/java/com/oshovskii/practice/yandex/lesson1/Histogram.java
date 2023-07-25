package com.oshovskii.practice.yandex.lesson1;

import java.io.PrintWriter;
import java.util.*;

public class Histogram {
    public static void main(String[] args) {
        makeHistogram();
    }

    public static void makeHistogram() {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String string = in.nextLine();

        List<Character> ignore = List.of(' ', '\n');

        int max = 0;
        Map<Character, Integer> strToCountMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            Character ch = string.charAt(i);
            if (ignore.contains(ch)) {
                continue;
            }

            if (!strToCountMap.containsKey(ch)) {
                strToCountMap.put(ch, 1);
                continue;
            }

            int value = strToCountMap.get(ch) + 1;
            strToCountMap.put(ch, value);
            if (value > max) max = value;
        }

        List<Character> sortedKeys = strToCountMap.keySet().stream().sorted().toList();
        for (int i = max; i >= 0; i--) {
            for (int j = 0; j < sortedKeys.size(); j++) {
                if (i == 0) {
                    System.out.print(sortedKeys.get(j));
                    continue;
                }
                Integer value = strToCountMap.get(sortedKeys.get(j));
                if (value >= i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        out.flush();
    }

    public static void createHistogram(String input) {
        char[] strToArray = input.toCharArray();
        HashMap<Character, Long> characterMap = new HashMap<>(strToArray.length);

        for (int i = 0; i < strToArray.length; i++) {
            if (strToArray[i] == ' ' || strToArray[i] == '\n') {
                continue;
            }
            if (characterMap.containsKey(strToArray[i])) {
                characterMap.put(strToArray[i], characterMap.get(strToArray[i]) + 1L);
            } else {
                characterMap.put(strToArray[i], 1L);
            }
        }

        char[] dst = new char[characterMap.size()];
        int z = 0;
        for (Character key : characterMap.keySet()) {
            dst[z++] = key;
        }

        Arrays.sort(dst);

        char grid = '#';
        for (int i = 0; i < dst.length; i++) {
            for (int j = 0; j < characterMap.get(dst[i]); j++) {
                System.out.print(grid);
            }
            System.out.println(dst[i]);
        }
    }
}
