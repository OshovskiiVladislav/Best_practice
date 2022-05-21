package com.oshovskii.practice.other.lesson15;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class MainApp {
    static String inputString = "12345678";

    // Количество ядер на компе
    static int numOfTreads = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        System.out.println(new Date());

        ForkJoinPool pool = new ForkJoinPool(numOfTreads);
        System.out.println(pool.invoke(new MyFork(0, inputString.length(), inputString)));

        System.out.println(new Date());
    }

    static class MyFork extends RecursiveTask<String> {
        long from;
        long to;
        String reverseString;

        public MyFork(long from, long to ,String reverseString) {
            this.from = from;
            this.to = to;
            this.reverseString = reverseString;
        }

        // Делает весь подсчёт
        @Override
        protected String compute() {
            long partition = inputString.length()/numOfTreads;
            if (partition < 2) {
                partition = 2;
            }

            if ((to - from) <= partition) {
                // Тут описана вся логика
                return new StringBuilder(reverseString).reverse().toString();
            } else {
                // Разбиваем на 2
                long middle = (to + from)/2;

                String stringFirstHalf = reverseString.substring(0, (reverseString.length() / 2));
                String stringSecondHalf = reverseString.substring((reverseString.length() / 2));

                    MyFork firstHalf = new MyFork(from, middle, stringFirstHalf);
                    firstHalf.fork();

                    MyFork secondHalf = new MyFork(middle + 1, to, stringSecondHalf);
                    String secondValue = secondHalf.compute();
                    return firstHalf.join() + secondValue;
            }
        }
    }
}
