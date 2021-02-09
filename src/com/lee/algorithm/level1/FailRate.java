package com.lee.algorithm.level1;

public class FailRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        double nfail[] = new double[N];
        int count = 0;
        int pcount = stages.length;



        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if(stages[j] == i) {     // 도달은 했지만 못깬사람
                    count += 1;
                }

            }
            nfail[i-1] = (double)count / (double)pcount;
            pcount -= count;

            System.out.println("p : " + pcount);
            System.out.println("c : " + count);
            System.out.println(nfail[i-1]);
            count = 0;
        }

        return answer;
    }
    public static void main(String[] args) {
        new FailRate().solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
    }
}
