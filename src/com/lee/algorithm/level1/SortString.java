package com.lee.algorithm.level1;

import java.util.Arrays;

public class SortString {

    public String[] solution(String[] strings, int n) {

        String[] answer = {};

        char[] a = new char[strings.length];

        for (int i = 0; i < strings.length; i++) {
            String index = strings[i];
            a[i] = index.charAt(n);
        }

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        return answer;
    }

    public static void main(String[] args) {
        new SortString().solution(new String[]{"sun", "bed", "car"}, 1);
    }
}
