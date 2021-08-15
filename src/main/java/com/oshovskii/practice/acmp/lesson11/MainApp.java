package com.oshovskii.practice.acmp.lesson11;

import java.io.PrintWriter;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        Integer r1 = in.nextInt();
        Integer r2 = in.nextInt();
        Integer r3 = in.nextInt();

        System.out.println(r1 >= (r2 + r3) ? "YES" : "NO");

        out.flush();
    }
}