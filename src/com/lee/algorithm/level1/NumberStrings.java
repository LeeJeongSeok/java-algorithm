package com.lee.algorithm.level1;

public class NumberStrings {
    boolean solution(String s) {
        boolean answer = true;

        char[] a = s.toCharArray();

        int p_count = 0;
        int y_count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'p' || a[i] == 'P') {
                p_count++;
            }

            if (a[i] == 'y' || a[i] == 'Y') {
                y_count++;
            }
        }

        if (p_count != y_count) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        new NumberStrings().solution("Pyy");
    }
}
