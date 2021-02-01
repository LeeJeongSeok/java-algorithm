package com.lee.algorithm.level1;

import java.util.ArrayList;

public class MockTest {
    public int[] solution(int[] answers) {

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i%5]) {
                score[0]++;
            }

            if (answers[i] == second[i%8]) {
                score[1]++;
            }

            if (answers[i] == third[i%10]) {
                score[2]++;
            }
        }

        // 최대값 찾기
        int max = 0;
        for(int i = 0; i < 3; i++){
            if(score[i] > max)
                max = score[i];
        }

        // 최대값과 같은 수포자 찾기
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if(score[i] == max){
                tmp.add(i+1);
            }
        }

        // 최대값과 같은 수포자 answer에 넣기.
        int[] answer = new int[tmp.size()];
        for(int i = 0; i < tmp.size(); i++)
            answer[i] = tmp.get(i);


        return answer;
    }

    public static void main(String[] args) {
        new MockTest().solution(new int[]{1, 2, 3, 4, 5});
        new MockTest().solution(new int[]{1, 3, 2, 4, 2});

        for (int i = 0; i < 10; i++) {
            System.out.println(i % 10);
        }
    }
}
