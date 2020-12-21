package com.lee.algorithm.codeup;

/*
문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
변수에 저장되어 있는 문자를 그대로 출력해보자.

참고
char x;
scanf("%c", &x);
printf("%c", x);

와 같은 방법으로 가능하다.

입력
문자 1개가 입력된다.
(단, 입력되는 문자는 알파벳 대, 소문자 및 숫자를 비롯한 아스키코드로 표현할 수 있는 문자들만 입력된다.)


출력
입력된 문자를 그대로 출력한다.


입력 예시
p

출력 예시
p


 */

import java.util.Scanner;

public class Problem1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(word);
    }
}
