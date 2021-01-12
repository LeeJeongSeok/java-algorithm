package com.lee.algorithm.level1;


public class ColatzGuess {
    public int solution(long num) {

        int answer = 0;

        while (answer < 500) {

            if (num == 1) {
                return answer;
            }

            if (num % 2 == 0) {
                num = num / 2;
                answer++;
            } else {
                num = (num * 3) + 1;
                answer++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new ColatzGuess().solution(8000000);
    }
}
