package com.lee.algorithm.level1;

public class DartGame {

        public int solution(String dartResult) {
            // 1S2D*3T
            // 37
            int answer = 0;

            String testResult = "1S2D3T";

            String[] words = testResult.split("");

            for(int i = 0; i < words.length; i++) {
                if (words[i].equals("S") || words[i].equals("D") || words[i].equals("T")) {
                    changeInt(words[i]);
                }
            }

            return answer;
        }


        private int changeInt(String word) {

            char ch = word.charAt(0);

            int temp = (int) ch;

            switch (temp) {
                case 83: // S
                    // 제곱
                    System.out.println(temp);
                    break;
                case 68: // D
                    // 제곱2

                    System.out.println(temp);
                    break;
                case 84: // T
                    System.out.println(temp);
                    break;
                case 42: // *
                    System.out.println(temp);
                    break;
                case 35: // #
                    System.out.println(temp);
                    break;

            }

            return 0;
        }

    public static void main(String[] args) {
        new DartGame().solution("1S2D3T");
    }
}
