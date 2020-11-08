package com.lee.algorithm;

public class Problem3 {
    public int solution(int money, String[] expected, String[] actual) {
        int answer = -1;

        int bet = 100; // 배팅금액

        for (int i = 0; i < expected.length; i++) {
            if (!expected[i].equals(actual[i])) {
                money -= bet;
                bet *= 2;
            } else {
                money += bet;
                bet = 100;
            }

            if (money <= 0) {
                money = 0;
            }
        }

        answer = money;

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        //new Problem3().solution(1000, new String[]{"H", "T", "H", "T", "H", "T", "H"}, new String[]{"T", "T", "H", "H", "T", "T", "H"});
        new Problem3().solution(1200, new String[]{"T", "T", "H", "H", "H"}, new String[]{"H", "H", "T", "H", "T"});
        //new Problem3().solution(1500, new String[]{"H", "H", "H", "T", "H"}, new String[]{"T", "T", "T", "H", "T"});
    }
}
