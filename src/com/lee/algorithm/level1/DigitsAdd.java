package com.lee.algorithm.level1;

public class DigitsAdd {

    public int solution(int n) {
        int answer = 0;


        while (n >= 1) {
            answer += n % 10;
            n = n / 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        new DigitsAdd().solution(98701);
    }
}
