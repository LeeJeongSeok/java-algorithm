package com.lee.algorithm.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DividingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 3};
        int divisor = 10;
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%divisor == 0) {
                answer.add(arr[i]);
            }
        }

        if (answer.isEmpty()) {
            answer.add(-1);
        }

        Collections.sort(answer);

        for (int ans : answer) {
            System.out.println(ans);
        }
    }
}
