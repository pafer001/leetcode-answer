package com.offer.answer._13;

public class RobotMovingCount {

    public static void main(String[] args) {
        final int i = new RobotMovingCount().movingCount(1, 2, 1);
        System.out.println(i);
    }

    public int movingCount(int m, int n, int k) {
        int[][] visited = new int[m][n];
        return dfs(0, 0, m, n, k, visited);
    }


    public int dfs(int i, int j, int m, int n, int k, int[][] visited) {

        if (i >= m || j >= n || i < 0 || j < 0 || visited[i][j] == 1) {

            return 0;
        }

        if (digitSum(i) + digitSum(j) > k) {
            return 0;
        }

        visited[i][j] = 1;
        return 1 + dfs(i + 1, j, m, n, k, visited) + dfs(i, j + 1, m, n, k, visited);
    }


    int digitSum(int i) {

        int tmp = 0;
        while (i != 0) {
            tmp += i % 10;
            i = i / 10;
        }
        return tmp;

    }
}
