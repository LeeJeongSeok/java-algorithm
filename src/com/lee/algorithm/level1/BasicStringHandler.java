package com.lee.algorithm.level1;

public class BasicStringHandler {
    public boolean solution(String s) {

        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                char check = s.charAt(i);

                if (Character.isDigit(check)) {
                    answer = true;
                } else {
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        new BasicStringHandler().solution("a234");
    }
}
