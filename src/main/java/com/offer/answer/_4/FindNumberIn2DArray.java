package com.offer.answer._4;

public class FindNumberIn2DArray {

    public static void main(String[] args) {

        int[][] matrix = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};


        final boolean numberIn2DArray = new FindNumberIn2DArray().findNumberIn2DArray(matrix, 5);
        System.out.println(numberIn2DArray);
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix== null || matrix.length == 0) {
            return false;
        }
        int i = 0;
        int j = matrix[0].length - 1;

        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] > target) {

                j--;

                continue;
            }

            if (matrix[i][j] < target) {
                i++;
                continue;
            }
        }

        return false;
    }
}