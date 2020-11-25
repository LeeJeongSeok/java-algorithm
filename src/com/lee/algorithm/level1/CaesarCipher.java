package com.lee.algorithm.level1;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch+n);
                if (ch > 'z') {
                    ch -= 26;
                }
            } else if (ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch+n);
                if (ch > 'Z') {
                    ch -= 26;
                }
            }

            answer += Character.toString(ch);
        }

        return answer;
    }

    public static void main(String[] args) {
        new CaesarCipher().solution("a B z", 4);
    }
}
