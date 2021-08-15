package com.oshovskii.practice.acmp.lesson12;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String time1 = in.nextLine();
        Integer hour = in.nextInt();
        Integer minutes = in.nextInt();

        String[] arr = time1.split(":");
        int arrivalTimeHour = hour + Integer.parseInt(arr[0]);
        int arrivalTimeMinutes = minutes + Integer.parseInt(arr[1]);
        if (arrivalTimeMinutes >= 60) {
            arrivalTimeHour++;
        }
        arrivalTimeMinutes = arrivalTimeMinutes % 60;
        arrivalTimeHour = arrivalTimeHour % 24;

        System.out.printf("%02d:%02d", arrivalTimeHour, arrivalTimeMinutes);

        out.flush();
    }
}
