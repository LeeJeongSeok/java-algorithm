package com.lee.algorithm.level1;

import java.util.Arrays;
import java.util.Collections;

public class IntegerDescending {
    public long solution(long n) {

        long answer = 0;

        String[] numbers = String.valueOf(n).split("");
        Arrays.sort(numbers, Collections.reverseOrder());

        String number = "";

        for (int i = 0; i < numbers.length; i++) {
            number += numbers[i];
        }

        answer = Long.parseLong(number);

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        new IntegerDescending().solution(809120300);
    }
}
