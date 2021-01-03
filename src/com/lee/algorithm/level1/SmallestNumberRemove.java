package com.lee.algorithm.level1;

import java.util.ArrayList;

public class SmallestNumberRemove {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if (arr[0] == -10) {
            answer[0] = -1;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        list.remove(arr.length-1);
        answer = new int[list.size()];



        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        new SmallestNumberRemove().solution(new int[]{-10});
    }
}
