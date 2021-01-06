package com.lee.algorithm.level1;

public class SquareRootDiscrimination {
    public long solution(long n) {

        long answer = 0;

        long target = (long)Math.sqrt(n);
        if (n == (long) Math.pow(target, 2)) {
            answer = (long) Math.pow(target+1, 2);
        } else {
            answer = -1;
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        new SquareRootDiscrimination().solution(3);
    }
}
