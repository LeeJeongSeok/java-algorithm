package com.lee.algorithm.level1;

import java.util.ArrayList;
import java.util.Collections;

public class SmallestNumberRemove {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        if (arr.length <= 1) {
            return new int[] {-1};
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        while (list.contains(min)) {
            int i = list.indexOf(min);
            list.remove(i);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        new SmallestNumberRemove().solution(new int[]{8, 9, 1, 3, 2});
    }
}
