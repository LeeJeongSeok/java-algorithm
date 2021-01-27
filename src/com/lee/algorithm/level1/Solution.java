package com.lee.algorithm.level1;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); // 실제로 값이 들어갈 땐 index 번호로 들어가기때문에 -1를 해줘야함
            Arrays.sort(temp);

            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
    public static void main(String[] args) {
        new Solution().solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }
}
