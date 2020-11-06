package com.lee.algorithm.level1;

import java.util.ArrayList;

public class FindKim {
    public String solution(String[] seoul) {

        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = ("김서방은" + i + "번 째 있다.");
                System.out.println("김서방은 " + i + "에 있다.");
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] testData = {"Jane", "Lee", "Kim"};
        new FindKim().solution(testData);
    }
}
