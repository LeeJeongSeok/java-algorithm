package com.lee.algorithm.level1;

public class DeleteDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 3, 3};
        int count = arr.length;

        for (int i = 0; i < count; i++) {
            if (arr[i] == arr[i+1]) {
                arr[i] = arr[i+1];
                count--;
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
