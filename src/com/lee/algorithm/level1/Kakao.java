package com.lee.algorithm.level1;

import java.util.ArrayList;

public class Kakao {
    public int solution(int[][] board, int[] moves) {
        int answer = 0, count = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i]-1] != 0) {
                    list.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }

            }
        }




        for (int i = 0; i < list.size()-1; i++) {

            if (list.get(i) == list.get(i+1)) {
                list.remove(i);
                list.remove(i);
                count += 2;
                i = -1;
            }
        }


        answer = count;


        return answer;
    }

    public static void main(String[] args) {
        new Kakao().solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4});
        new Kakao().solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,5,1,4,3});
    }
}
