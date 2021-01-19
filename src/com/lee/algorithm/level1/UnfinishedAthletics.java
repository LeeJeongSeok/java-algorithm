package com.lee.algorithm.level1;

import java.util.Arrays;


public class UnfinishedAthletics {
    public String solution(String[] participant, String[] completion) {

        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            for (int j = 0; j < participant.length; j++) {
                if (!participant[j].equals(completion[i])) {
                    answer = participant[j];
                }
            }
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        new UnfinishedAthletics().solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
    }
}
