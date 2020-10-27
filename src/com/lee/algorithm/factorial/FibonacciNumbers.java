package com.lee.algorithm.factorial;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println(fibonacci(number));
    }

    public static int fibonacci(int number) {
        int first = 0;
        int second = 1;

        int sum = 0;

        if (number == 2) {
            sum = first + second;
            return sum;
        }

        for (int i = 2; i <= number; i++) {
            sum = first + second;
            first = second;
            second = sum;

        }

        return sum;
    }
}
