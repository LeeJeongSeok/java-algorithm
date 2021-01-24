package com.lee.algorithm.level1;

import java.util.Arrays;


public class UnfinishedAthletics {
    public String solution(String[] participant, String[] completion) {

        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        new UnfinishedAthletics().solution(new String[]{"mislav"}, new String[]{});
    }
}
