package com.lee.algorithm.level1;

public class PhoneNumberChange {
    public String solution(String phone_number) {

        StringBuilder builder = new StringBuilder(phone_number);

        for (int i = 0; i < phone_number.length()-4; i++) {
            builder.setCharAt(i, '*');
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        new PhoneNumberChange().solution("027778888");
    }
}
