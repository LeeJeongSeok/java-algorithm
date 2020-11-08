package com.lee.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem6 {
    class Student {
        String id;
        String number;
        String score;

        public Student(String id, String number, String score) {
            this.id = id;
            this.number = number;
            this.score = score;
        }

        public String getId() {
            return id;
        }


        public String getNumber() {
            return number;
        }


        public String getScore() {
            return score;
        }

    }

    public String[] solution(String[] logs) {
        String[] answer = {};
        int count = 0;

        Arrays.sort(logs);

        ArrayList<Student> members = new ArrayList<>();

//        String[] studentId = new String[logs.length];
//        String[] problem = new String[logs.length];
//        String[] score = new String[logs.length];

        for (String student : logs) {

            Student std = new Student(student.split(" ")[0], student.split(" ")[1], student.split(" ")[2]);
            members.add(std);

            /*
            1. 두 수험자가 푼 문제 수가 같다. 단, 푼 문제 수가 5 미만인 경우는 제외한다.
            2. 두 수험자가 푼 문제의 번호가 모두 같다.
            3. 두 수험자가 푼 문제의 점수가 모두 같다.
            */

            if (std.getId() == student.split(" ")[0]) {
                count++;
            }

            if (std.getNumber() == student.split(" ")[1]) {
                count++;
            }

            if (std.getScore() == student.split(" ")[2]) {
                count++;
            }

            if (count >= 5) {
                System.out.println("부정행위입니다.");
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        new Problem6().solution(new String[]{"0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90", "0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"});
    }


}
