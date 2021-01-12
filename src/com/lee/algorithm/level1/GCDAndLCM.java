package com.lee.algorithm.level1;

public class GCDAndLCM {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = getGreatest(n, m);
        answer[1] = n * m / answer[0];


        return answer;
    }

    private int getGreatest(int n, int m) {

        if (m == 0) {
            return n;
        } else {
            return getGreatest(m, n % m);
        }
    }


    public static void main(String[] args) {
        new GCDAndLCM().solution(2304, 1440);
    }
}
