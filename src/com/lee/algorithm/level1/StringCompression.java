package com.lee.algorithm.level1;

public class StringCompression {
    public int solution(String s) {
        int answer = 1;

        String[] text = s.split("");

        for (int i = 1; i < s.length()/2; i++) {
            answer = 1;
            for (int j = 0; j < text.length-1; j++) {
                if (text[j] == text[j+1]) {
                    answer++;
                } else {
                    text[j] = Integer.toString(answer);
                }
            }
        }

        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]);
        }




        return answer;
    }


    public static void main(String[] args) {
        new StringCompression().solution("aabbaccc");
    }
}
