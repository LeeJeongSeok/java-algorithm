package com.lee.algorithm.level1;

import java.util.Arrays;
import java.util.Collections;

public class IntegerDescending {
    public long solution(long n) {

        String[] numbers = Integer.toString((int)n).split("");
        String number = "";
        Arrays.sort(numbers, Collections.reverseOrder());

        for (int i = 0; i < numbers.length; i++) {
            number += numbers[i];
        }

        long answer = Long.parseLong(number);

        return answer;
    }

    public static void main(String[] args) {
        new IntegerDescending().solution(118372);
    }
}
