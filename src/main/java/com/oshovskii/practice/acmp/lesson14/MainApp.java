package com.oshovskii.practice.acmp.lesson14;

import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        // n - количество игроков
        Integer n = in.nextInt();
        // m - max уровень
        Integer m = in.nextInt();
        // белые < k-1, k - это сколько уровней "большая" фишка
        Integer k = in.nextInt();

        if (m >= k) {
            System.out.println(n * (m / k + (k - 1)));
        } else {
            System.out.println(n * m);
        }
        out.flush();
    }
}
