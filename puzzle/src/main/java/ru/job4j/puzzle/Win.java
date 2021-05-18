package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {

        boolean result = false;
        for (int i = 0; i < board[0].length; i++) {
            int row = 1;
            int col = 1;
            for (int j = 0; j < board.length; j++) {
                row *= board[i][j];
                col *= board[j][i];
            }
            if (row == 1 || col == 1) {
                result = true;
                break;
            }

        }
        return result;
    }
}