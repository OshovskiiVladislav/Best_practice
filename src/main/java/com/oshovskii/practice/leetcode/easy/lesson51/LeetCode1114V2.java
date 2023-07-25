package com.oshovskii.practice.leetcode.easy.lesson51;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1114. Print in Order
 * ReentrantLock and conditions
 */
public class LeetCode1114V2 {
    private int threadNumber;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public LeetCode1114V2() {
        this.threadNumber = 1;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        try {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            this.threadNumber++;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        try {
            while (this.threadNumber != 2) {
                condition.await();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            this.threadNumber++;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        try {
            while (this.threadNumber != 2) {
                condition.await();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            this.threadNumber++;
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
