package com.lee.algorithm.practice;

public class ReturnChange {
    public int[] solution(int money) {

        int[] answer = new int[9];
        int[] change_money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int count = 0;

        for (int i = 0 ; i < answer.length; i++) {
            if (money / change_money[i] >= 1) {
                count = money / change_money[i];
            }

            answer[i] = count;
            count = 0;

            money = money % change_money[i];
        }

        for (int i = 0 ; i < answer.length; i++) { // 결과 확인을 위한 코드입니다.
            System.out.print(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        new ReturnChange().solution(50237);
    }
}
