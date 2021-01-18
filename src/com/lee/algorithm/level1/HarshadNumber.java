package com.lee.algorithm.level1;

public class HarshadNumber {
    public boolean solution(int x) {

        boolean answer = true;

        int temp = x;
        int sum = 0;

        while (temp != 0) { // 1의 자리부터 거꾸로 나머지를 계산한 후 몫을 구하는 형식으로 풀어야 한다.
            sum += temp % 10;
            temp = temp / 10;
        }

        if (x % sum != 0) {
            answer = false;
        };

        return answer;

    }

    public static void main(String[] args) {
        new HarshadNumber().solution(13);
    }
}
