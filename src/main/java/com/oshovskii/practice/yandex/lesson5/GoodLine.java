package com.oshovskii.practice.yandex.lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodLine {
    public static void main(String[] args) {
        checkGoodLineScanner();
    }

    /**
     * N — количество различных букв в наборе (1≤N≤26).
     * c - количество букв соответствующего типа (1≤c i-ое≤ 10^9).
     * Таким образом, первое число означает количество букв "a", второе число задаёт количество букв "b" и так далее.
     */
    public static void checkGoodLineScanner() {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
            while (input.hasNextDouble()) {
            list.add(input.nextInt());
        }

        int n = list.get(0);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                if (list.get(i) < list.get(i + 1)) {
                    count = count + list.get(i);
                } else {
                    count = count + list.get(i + 1);
                }
            }
        }

        input.close();

        System.out.println(count);
    }


    public static Integer checkGoodLine(int n, int...c) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                if (c[i] < c[i + 1]) {
                    count = count + c[i];
                } else {
                    count = count + c[i + 1];
                }
            }
        }
        return count;
    }
}
