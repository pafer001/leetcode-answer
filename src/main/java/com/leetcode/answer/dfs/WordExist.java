package com.leetcode.answer.dfs;

public class WordExist {

    public static void main(String[] args) {
        char[][] board = {{'A','B'},{'S','F'}};

        final boolean abcced = new WordExist().exist(board, "ABCCED");
        System.out.println(abcced);
    }
    public boolean exist(char[][] board, String word) {

        for (int i =0; i< board.length; i++) {

            for (int j=0; j< board[0].length; j++) {
                if (wordExist(board, i, j, word.toCharArray(), 0)) {
                    return true;
                }

            }
        }
        return false;
    }

    public boolean wordExist(char[][] board, int i, int j, char[] word, int index) {
        if (index >= word.length) {
            return true;
        }
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0) {
            return false;
        }

        if (board[i][j] != word[index]) {
            return false;
        }
        char temp = board[i][j];

        board[i][j] = '*'; //此处覆盖避免来回使用该字母

        boolean result =  wordExist(board, i+1, j, word, index +1)
                ||  wordExist(board, i, j+1, word, index +1)
                || wordExist(board, i-1, j, word, index +1)
                || wordExist(board, i, j-1, word, index +1);
        board[i][j] = temp;
        return result;

    }
}
