package com.offer.answer._12_;

public class Array2DPath {

    public boolean exist(char[][] board, String word) {

        final char[] wordArray = word.toCharArray();

        for (int i =0; i < board.length; i++) {

            for (int j =0; j < board[0].length ; j++) {
                if (dfs(board, wordArray, i, j, 0)) {
                    return true;
                }

            }
        }

        return false;
    }

    boolean dfs(char[][] board, char[] word, int i, int j, int k) {

        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 ) {
            return false;
        }

        if (word[k] != board[i][j]) {
            return false;
        }

        if (k ==  word.length -1) {
            return true;
        }

        board[i][j] = '\0';

        boolean res = dfs(board, word, i+1, j, k) || dfs(board, word, i-1, j, k)
                || dfs(board, word, i, j+1, k) || dfs(board, word, i, j-1, k);
        board[i][j] = word[k];

        return res;

    }
}