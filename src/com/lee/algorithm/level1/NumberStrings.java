package com.lee.algorithm.level1;

public class NumberStrings {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        if (s.contains("p")) {
            count++;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(count);

        return answer;
    }

    boolean noPandY() {
        return true;
    }

    public static void main(String[] args) {
        new NumberStrings().solution("pPoooyY");
    }
}
