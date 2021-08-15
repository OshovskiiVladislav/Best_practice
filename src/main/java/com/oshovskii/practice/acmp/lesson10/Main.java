package com.oshovskii.practice.acmp.lesson10;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        Integer a1 = in.nextInt();
        Integer a2 = in.nextInt();
        Integer n = in.nextInt();
        int c = a2 - a1;
        int result = a1 + c * (n - 1);
        System.out.println(result);
        out.flush();
    }
}
