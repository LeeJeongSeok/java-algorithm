package com.lee.algorithm.level1;

public class MatrixAddition {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length]; // answer의 크키는 x로는 arr1만큼, y로는 arr2 만큼 추가

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        new MatrixAddition().solution(new int[][]{{1,2}, {2,3}}, new int[][]{{3, 4},{5, 6}});
        new MatrixAddition().solution(new int[][]{{1},{2}}, new int[][]{{3},{4}});
    }
}
