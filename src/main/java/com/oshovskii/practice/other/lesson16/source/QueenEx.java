package com.oshovskii.practice.other.lesson16.source;

public class QueenEx {
    private int size;
    private int board[][];
    private int resultsCount = 0;
    private int threadsCount;

    public QueenEx(int n, int potok) {
        size = n;
        board = new int[n][n];
        //zan=new boolean [N][N];
        resultsCount = 0;
        threadsCount = potok;
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

    public void setQueen(int a) {
        if (a == size) {
            ++resultsCount;
            System.out.print("Result #" + resultsCount + '\n');
            showBoard();
            return;
        }
        for (int i = 0; i < size; ++i) {
            if (tryQueen(a, i)) {
                board[a][i] = 1;
                setQueen(a + 1);
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
    }
}
