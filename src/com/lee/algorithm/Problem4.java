package com.lee.algorithm;

public class Problem4 {
    public int solution(int n, int[][] board) {
        int answer = 0;

        // 뱡향 전환을 위한 배열
        int [][]direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // (0,0)에서 출발
        int currentX = 0;
        int currentY = 0;

        for (int i = 0; i < 4; i++) {

        }
        return answer;
    }

    public static void main(String[] args) {
        new Problem4().solution(3, new int[][]{{3, 5, 6}, {9, 2, 7}, {4, 1, 8}});
    }
}
