package com.lee.algorithm.level1;

public class DeleteDuplicateNumber {
    public static void main(String[] args) {
        //int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] arr = {4, 4, 4, 3, 3};
        int count = arr.length;

        for (int i = 0; i < count-1; i++) {
            if (arr[i] == arr[i+1]) {
                arr[i] = arr[i+1];
                if (i == arr.length) {

                }
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
