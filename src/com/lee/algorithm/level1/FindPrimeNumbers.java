package com.lee.algorithm.level1;

public class FindPrimeNumbers {
    public int solution(int n) {

        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return 0;
            }
            answer++;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        new FindPrimeNumbers().solution(10);
    }
}
