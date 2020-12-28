package com.lee.algorithm.level1;

public class TwoThousandSixteen {

    public String solution(int a, int b) {

        String answer = "";

        int days[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 4;

        for (int i = 0; i < a-1; i++) {
            day += days[i];
        }

        day += b;

        System.out.println(day%7);

        switch (day%7) {
            case 0:
                answer = "SUN";
                break;
            case 1:
                answer = "MON";
                break;
            case 2:
                answer = "TUE";
                break;
            case 3:
                answer = "WED";
                break;
            case 4:
                answer = "THU";
                break;
            case 5:
                answer = "FRI";
                break;
            case 6:
                answer = "SAT";
                break;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        new TwoThousandSixteen().solution(12, 25);
    }
}
