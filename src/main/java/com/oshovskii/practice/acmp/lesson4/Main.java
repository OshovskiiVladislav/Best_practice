package com.oshovskii.practice.acmp.lesson4;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int c = in.nextInt();
        int h = in.nextInt();
        int o = in.nextInt();

        final int CARBON = 2;
        final int HYDROGEN = 6;

        out.println(
                Arrays.asList(c / CARBON, h / HYDROGEN, o).stream()
                        .min(Integer::compare).get());
        out.flush();
    }
}