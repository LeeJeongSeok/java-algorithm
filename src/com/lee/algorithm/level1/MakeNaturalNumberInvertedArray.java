package com.lee.algorithm.level1;

/*
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.

입출력 예
n	    return
12345	[5,4,3,2,1]
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MakeNaturalNumberInvertedArray {
    public int[] solution(long n) {

        int[] answer = {};

        //ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (n % 10 != 0) {
            arrayList.add((int)n % 10);
            n = n / 10;
        }

        answer = new int[arrayList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
            System.out.print(answer[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        new MakeNaturalNumberInvertedArray().solution(9876543);
    }
}
