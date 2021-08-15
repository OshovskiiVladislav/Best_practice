package com.oshovskii.practice.acmp.lesson13;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        Integer boardSize = in.nextInt();
        System.out.println(boardSize * boardSize - ((3 * boardSize) - 2));

        out.flush();
    }
}
