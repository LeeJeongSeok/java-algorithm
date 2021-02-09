package com.lee.algorithm.level1;


import java.util.Scanner;

public class GetCenterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int count = str.length();

        if (count % 2 == 0) {
            System.out.println(str.substring(count/2 - 1, count/2 + 1));
        } else {
            System.out.println(str.charAt((count/2)));
        }

    }
}
