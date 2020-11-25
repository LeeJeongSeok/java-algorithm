package com.lee.algorithm.level1;

public class SumYAKSU {
    public int solution(int n) {

        int answer = 0;

        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
                System.out.println(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        new SumYAKSU().solution(5);
    }
}
