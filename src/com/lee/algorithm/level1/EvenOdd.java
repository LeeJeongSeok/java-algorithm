package com.lee.algorithm.level1;

public class EvenOdd {
    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        new EvenOdd().solution(3);
    }
}
