package com.lee.algorithm.level1;

import java.io.CharConversionException;
import java.util.Arrays;
import java.util.Collections;

public class DescendingString {
    public String solution(String s) {
        char[] array = s.toCharArray();

        Arrays.sort(array, Collections.reverseOrder());

        String answer = Arrays.toString(array);

        System.out.println(answer);


        return answer;
    }

    public static void main(String[] args) {
        new DescendingString().solution("Zbcdefg");
    }
}
