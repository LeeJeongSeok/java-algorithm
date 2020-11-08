package com.lee.algorithm;

import java.util.HashMap;

public class Problem1 {
    public int solution(String[] grades, int[] weights, int threshold) {
        int answer = -1234567890;
        int score = 10;
        int result = 0;

        String[] grades_arr = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};


        // 성적에 맞는 가중치 값을 넣음
       HashMap<String, Integer> map = new HashMap<String, Integer>();
       initializeWeight(score, grades_arr, map);

        // 고유 가중치 계산
        answer = calculateWeight(grades, weights, threshold, result, map);


        return answer;
    }

    private int calculateWeight(String[] grades, int[] weights, int threshold, int result, HashMap<String, Integer> map) {
        int answer;
        int temp_result;
        for (int i = 0; i < weights.length; i++) {
            temp_result = map.get(grades[i]) * weights[i];
            result += temp_result;
        }

        answer = result - threshold;
        return answer;
    }

    private void initializeWeight(int score, String[] grades_arr, HashMap<String, Integer> map) {
        for (int i = 0; i < grades_arr.length; i++) {
            map.put(grades_arr[i], score);
            score--;

            if (i == 8) {
                map.put(grades_arr[i], 0);
            }
        }
    }


    public static void main(String[] args) {
        //new Problem1().solution(new String[]{"A+", "D+", "F", "C0"}, new int[]{2, 5, 10, 3}, 50);
        new Problem1().solution(new String[]{"B+", "A0", "C+"}, new int[]{6, 7, 8}, 200);
    }
}
