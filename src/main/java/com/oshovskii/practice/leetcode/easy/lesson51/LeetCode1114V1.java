package com.oshovskii.practice.leetcode.easy.lesson51;

/**
 * 1114. Print in Order
 * Broad force - synchronized
 */
public class LeetCode1114V1 {
    public int threadNumber;

    public LeetCode1114V1() {
        threadNumber = 1;
    }

    synchronized public void first(Runnable printFirst) throws InterruptedException {
        while (threadNumber != 1) {
            wait();
        }
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        threadNumber++;
        notifyAll();
    }

    synchronized public void second(Runnable printSecond) throws InterruptedException {
        while (threadNumber != 2) {
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        threadNumber++;
        notifyAll();
    }

    synchronized public void third(Runnable printThird) throws InterruptedException {
        while (threadNumber != 3) {
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        threadNumber++;
        notifyAll();
    }
}
