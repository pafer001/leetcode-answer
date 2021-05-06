package com.leetcode.answer.array;

public class SearchMatrix {

    public static void main(String[] args) {

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        final boolean res = new SearchMatrix().searchMatrix(matrix, 3);
        System.out.println(res);
    }

    /**
     *
     * @param matrix int整型二维数组
     * @param target int整型
     * @return bool布尔型
     */
    public boolean searchMatrix (int[][] matrix, int target) {
        if(matrix == null) {
            return false;
        }
        return searchMatrix(matrix, target, 0,  matrix.length * matrix[0].length);
    }

    public boolean searchMatrix(int[][] matrix, int target, int low, int high) {

        if(high < low) {
            return false;
        }
        int middle =(high - low) / 2 + low;

        int index1 = (middle ) / matrix[0].length;
        int index2 = (middle ) % matrix[0].length;
        if (index1 >= matrix.length) {
            return false;
        }
        if (index2 >= matrix[0].length) {
            return false;
        }
        int tmpTarget = matrix[index1][index2];
        if(tmpTarget > target) {
            return searchMatrix(matrix, target, low, middle -1);
        } else if(tmpTarget < target) {
            return searchMatrix(matrix, target, middle +1, high);
        }
        return true;
    }
}
