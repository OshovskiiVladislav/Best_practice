package com.oshovskii.practice.other.lesson16;

public class Solution {
    protected int size;
    protected int board[][];
    protected int resultsCount = 0;
    private int threadsCount;

    public Solution() {
    }

    public Solution(int N) {
        size = N;
        board = new int[N][N];
        //zan=new boolean [N][N];
        resultsCount = 0;
    }

    public boolean tryQueen(int a, int b) {
        for (int i = 0; i < a; ++i)
            if (board[i][b] == 1)
                return false;

        for (int i = 1; i <= a && b - i >= 0; ++i)
            if (board[a - i][b - i] == 1)
                return false;

        for (int i = 1; i <= a && b + i < size; i++)
            if (board[a - i][b + i] == 1)
                return false;

        return true;
    }

    public void setQueen(int a) throws InterruptedException {
        for (int i = 0; i < size; ++i) {
            if (tryQueen(a, i)) {
                board[a][i] = 1;
                Thread thr = new MyThread(this, a + 1);
                thr.start();
                thr.join();
                board[a][i] = 0;
            }
        }
        return;
    }

    public void showBoard() {
        for (int a = 0; a < size; ++a) {
            for (int b = 0; b < size; ++b) {
                System.out.print((board[a][b] == 1) ? "Q " : ". ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int a = 0; a < size; ++a) {
            for (int b = 0; b < size; ++b) {
                if (board[a][b] == 1)
                    builder.append("Q ");
                else
                    builder.append(". ");
            }
        }
        String completedString = builder.toString();
        return completedString;
    }
}

class MyThread extends Thread {
    private volatile Solution clock;
    private volatile int position;

    public MyThread(Solution clock1, int pos) {
        position = pos;
        clock = clock1;
    }

    @Override
    public void run() {
        try {
            if (position == clock.size) {
                ++clock.resultsCount;
                System.out.print("Result #" + clock.resultsCount + '\n');
                clock.showBoard();
                return;
            }
            for (int i = 0; i < clock.size; ++i) {
                if (clock.tryQueen(position, i)) {
                    clock.board[position][i] = 1;
                    Thread thr = new MyThread(clock, position + 1);
                    thr.start();
                    thr.join();
                    clock.board[position][i] = 0;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
