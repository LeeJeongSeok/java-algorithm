package com.lee.algorithm.level1;

import java.io.CharConversionException;
import java.util.Arrays;
import java.util.Collections;

public class DescendingString {
    public String solution(String s) {
        Character[] array = new Character[s.length()]; // char로 선언했을 때 Arrays.sort가 에러나는 이유좀 찾아야함...

        for (int i = 0; i < array.length; i++) {
            array[i] = s.charAt(i);
        }

        Arrays.sort(array, Collections.reverseOrder());

        s = "";

        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }

        String answer = s;

        System.out.println(answer);


        return answer;
    }

    public static void main(String[] args) {
        new DescendingString().solution("Zbcdefg");
    }
}
