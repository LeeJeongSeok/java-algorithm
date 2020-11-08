package com.lee.algorithm;

public class Problem7 {
    public int[][] solution(int n, boolean horizontal) {
        int[][] answer = new int[n][n];
        int k = 0; // 증감 변수

        for (int i = 0; i < n+3; i++) {
            for (int j = 0; j < answer.length; j++) {

                int h = i - j;
                if (h >= 0 && h < n) {
                    k += 1;
                    answer[j][h] = k;
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + "\t");
            }
            System.out.println();
        }
        return answer;
    }

    public static void main(String[] args) {
        new Problem7().solution(4, true);
    }
}
