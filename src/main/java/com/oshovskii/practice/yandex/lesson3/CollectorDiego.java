package com.oshovskii.practice.yandex.lesson3;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorDiego {
    public static void main(String[] args) {
        findStickers(1, new int[]{5}, 2, new int[]{4, 6});
        findStickers(3, new int[]{100, 1, 50}, 3, new int[]{300, 0, 75});
        findStickersBinary(3, new int[]{12, 12, 1, 2, 7,100, 1, 50}, 3, new int[]{300, 0, 75});
    }

    // TODO think over this option
    public static void findStickersBinary(int countDiegoStickers, int[] numbersOfDiegoStickers, int countCollectors, int[] minStickers) {
        HashMap<Integer, Integer> result = new HashMap<>(countCollectors * 2);

        TreeSet<Integer> treeSetDiegoStickers= Arrays
                .stream(numbersOfDiegoStickers)
                .boxed()
                .collect(Collectors.toCollection(TreeSet::new));

        for (int i = 0; i < minStickers.length; i++) {
            if (treeSetDiegoStickers.contains(minStickers[i])) {
                System.out.println();
            }
        }
    }

    public static void findStickers(int countDiegoStickers, int[] numbersOfDiegoStickers, int countCollectors, int[] minStickers) {
        HashMap<Integer, Integer> result = new HashMap<>(countCollectors * 2);

        for (int i = 0; i < countCollectors; i++) {
            result.put(i, 0);
        }

        if (countDiegoStickers == 0) {
            for (Integer values : result.values()) {
                System.out.println(values);
            }
        }

        int collector = 0;
        for (int j = 0; j < minStickers.length; j++) {
            for (int i = 0; i < numbersOfDiegoStickers.length; i++) {
                System.out.println("Numbers of Diego stickers: " + numbersOfDiegoStickers[i]);
                System.out.println("The min sticker that satisfies : " + minStickers[j]);
                if (numbersOfDiegoStickers[i] <= minStickers[j]) {
                    result.put(j, result.get(j) + 1);
                    System.out.println("result.put(" + collector + ", 1);");
                    System.out.println("collector: " + collector);
                }
                System.out.println("=============================");
            }
        }

        for (Integer value : result.values()) {
            System.out.println(value);
        }
    }
}
