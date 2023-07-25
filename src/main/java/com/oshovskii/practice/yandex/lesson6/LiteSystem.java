package com.oshovskii.practice.yandex.lesson6;

import java.util.ArrayList;
import java.util.List;

// https://guava.dev/releases/snapshot/api/docs/com/google/common/collect/Range.html#intersection
// (com.google.common.collect.Range)
public class LiteSystem {
    public static void main(String[] args) {

        List<Integer> tmp1 = List.of(1, 3);
        List<Integer> tmp2 = List.of(4, 5);
        List<Integer> tmp3 = List.of(7, 8);
        List<Integer> tmp4 = List.of(4, 6);
        List<List<Integer>> list = List.of(tmp1, tmp2, tmp3, tmp4);
        System.out.println(liteSystem(10, 4, list).size());
    }

    public static List liteSystem(int countSectors, int countChapter, List<List<Integer>> list) {
        List<List<Integer>> mergeList = new ArrayList<>();
        for (List<Integer> range : list) {
             union(range.get(0), range.get(1), mergeList);
        }
        return mergeList;
    }

    public static List union(int a2, int b2, List<List<Integer>> mergeList) {
        mergeList.removeIf(range -> isIntercepts(range.get(0), range.get(1), a2, b2));
        List<Integer> tmp = List.of(a2, b2);
        mergeList.add(tmp);
        return mergeList;
    }

    public static Boolean isIntercepts(int a1, int b1, int a2, int b2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = a1; i <= b1; i++) {
            list1.add(i);
        }
        for (int i = a2; i <= b2; i++) {
            list2.add(i);
        }

        list1.retainAll(list2);
        return !list1.isEmpty();
    }
}
