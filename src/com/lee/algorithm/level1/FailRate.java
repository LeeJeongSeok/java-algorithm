package com.lee.algorithm.level1;

public class FailRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double nfail[] = new double[N];
        int count = 0;      // 스테이지에 도달했으나 클리어하지 못한 플레이어 수
        int pcount = stages.length;     // 스테이지에 도달한 플레이어 수


        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if(stages[j] == i) {     // 도달은 했지만 못깬사람
                    count += 1;
                }

                // 스테이지를 아무도 못깼을때

            }
            nfail[i-1] = (double)count / (double)pcount;    // 각 스테이지의 실패율
            pcount -= count;

            if(count == 0) {
                nfail[i-1] = 0;
            }
            count = 0;

        }


        // 최대값 구하는 로직
       for (int i = 0; i < nfail.length; i++) {
           double max = -1;
           int idx = 0;
           for (int j = 0; j < nfail.length; j++) {
               if (max < nfail[j]) {
                   max = nfail[j];
                   idx = j;
               }
           }

           nfail[idx] = -1;
           answer[i] = idx+1;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }


        return answer;
    }
    public static void main(String[] args) {
        new FailRate().solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
    }
}
