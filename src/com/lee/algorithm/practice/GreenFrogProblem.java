package com.lee.algorithm.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GreenFrogProblem {
    public String solution(String word) {
        String result = "";

        String[] array_word;

        String[] alphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] reverse_alphabet = reversing(alphabet);


        // map 초기화
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < alphabet.length; i++) {
            map.put(alphabet[i], reverse_alphabet[i]);
        }

        array_word = word.split("");


        // 변환작
        for (String c_word : array_word) {
            boolean is_upp = Character.isUpperCase(c_word.charAt(0));

            String temp_result = map.get(c_word);
            if (temp_result == null) {
                temp_result = " ";
            } else if (!is_upp) {
                temp_result = temp_result.toLowerCase();
            }

            result = result.concat(temp_result);

        }
        




        return result;
    }

    private String[] reversing(String[] alphabet) {
        List<String> list = Arrays.asList(alphabet);
        Collections.reverse(list);
        String[] r_alphabet = list.toArray(new String[list.size()]);

        return r_alphabet;
    }

    public static void main(String[] args) {
        new GreenFrogProblem().solution("I love you");
    }


}
