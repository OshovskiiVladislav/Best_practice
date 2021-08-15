package com.oshovskii.practice.acmp.lesson5;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();

        if(visokosniyYear(a)){
            System.out.printf("13/09/%04d",a);
        } else {
            System.out.printf("12/09/%04d", a);
        }
        out.flush();
    }
    public static boolean visokosniyYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Negative year");
        }
        return year % 4 != 0 || (year % 100 == 0 && year % 400 != 0);
    }
}
