package com.lee.algorithm.level1;

public class FindPrimeNumbers {
    public int solution(int n) {

        int answer = 0;

        for (int i = 2; i < n; i++) {
            boolean flag = true;
           for (int j = 2; j<= i; j++) {
               if (i % j == 0) {
                   flag = false;
                   break;
               }
           }

           if (flag == true) {
               answer++;
           }
        }

        return answer;
    }

    public static void main(String[] args) {
        new FindPrimeNumbers().solution(10);
    }
}
