package com.lee.algorithm;

public class Main {

    public static int factorial(int number) {

        if (number == 1) {
            return 1;
        }

        return number * factorial(number-1);

    }



    public static void main(String[] args) {
	// write your code here
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < 6; i++) {
            System.out.println(array[i]);
        }



    }
}
