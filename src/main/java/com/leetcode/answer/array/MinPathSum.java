package com.leetcode.answer.array;

public class MinPathSum {

    public static void main(String[] args) {
        int[][] grid =  new int[][]{{1,2},{5,6},{1,1}};
        final int i = new MinPathSum().minPathSum(grid);
        System.out.println(i);

    }
    public int minPathSum (int[][] grid) {
        // write code here

        int[][] pathArray = new int[grid.length][grid[0].length];
        pathArray[0][0] = grid[0][0];
        for(int i=1; i<grid.length; i++) {
            pathArray[i][0] = grid[i][0] + pathArray[i-1][0];
        }
        for(int i=1; i<grid[0].length; i++) {
            pathArray[0][i] = grid[0][i] + pathArray[0][i-1];
        }

        for(int i=1; i<grid.length; i++ ) {

            for(int j=1; j< grid[0].length; j++) {

                pathArray[i][j] =   grid[i][j] + Math.min(pathArray[i][j-1], pathArray[i-1][j]);
            }
        }
        return pathArray[grid.length-1][grid[0].length-1];
    }
}
