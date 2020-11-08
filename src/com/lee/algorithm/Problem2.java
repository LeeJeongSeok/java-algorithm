package com.lee.algorithm;

public class Problem2 {
    public long[] solution(String s, String op) {
        long[] answer = {};

        int temp[] = new int[s.length()];

        int left = 0;
        int right = 0;


        // 하나씩 분리하여 왼쪽, 오른쪽에 대입
        for (int i = 0; i < s.length(); i++) {

            if (i == 0) {
                left = Integer.parseInt(s.substring(i));
                right = Integer.parseInt(s.substring(s.length()+1));
                answer[i] = calculate(left, right, op);
            } else {
                left = Integer.parseInt(s.substring(i - 1, i));
                right = Integer.parseInt(s.substring(s.length()));
                answer[i] = calculate(left, right, op);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }

    private int calculate(int left, int right, String op) {

        int result = 0;

        switch (op) {
            case "+":
                result = left + right;
                break;
            case "-":
                result = left - right;
                break;
            case "*":
                result = left * right;
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        new Problem2().solution("1234", "+");
    }
}
