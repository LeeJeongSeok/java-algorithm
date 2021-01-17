package com.lee.algorithm.level1;

public class IntervalNumber {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];


        for (int i = 0; i < answer.length; i++) {
            answer[i] = (long) x * (i+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        new IntervalNumber().solution(-4, 2);
    }
}
