package com.lee.algorithm.level1;

public class DeleteDuplicateNumber {
    public static void main(String[] args) {
        //int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] arr = {4, 4, 4, 3, 3};
        int count = 1;

        // 첫번째 반복문에서 연속되지 않은 수의 개수를 파악한 후
        // 이를 기반으로 배열을 선언해 저장한다
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                count++;
            }
        }

        int[] answer = new int[count]; // count를 먼저 파악한 후 배열 생성
        int answerIdx = 1; // 1번지부터 시작하기위해 변수로 따로 선언했다.
        answer[0] = arr[0]; // 0번지는 겹치지 않기에 바로 집어넣었다.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                answer[answerIdx] = arr[i];
                answerIdx++;
            }
        }
    }
}
