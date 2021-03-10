package com.lee.algorithm.level2;

public class TruckMovingBridge {

    LimitedQueue<Integer> queue;

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int count = 0;

        queue = new LimitedQueue<>(bridge_length);

        // 다리를 건너는 트럭들의 truck_weights를 담
        for (int i = 0; i < truck_weights.length; i++) {
            count++;

            queue.add(truck_weights[i]);
            count++;
            // wait 체크
            checkWeight(weight);

            //
            crossBridge(truck_weights[i]);
            canCrossBridge(truck_weights[i], weight);
            answer = getTime(count, bridge_length);
        }


        System.out.println(count);
        System.out.println("몇초 : " + answer);

        return answer;
    }

    private boolean checkWeight(int weight) {
        int temp = 0;
        for (int i = 0; i < queue.size(); i++) {
            temp += queue.poll();
        }

        if (temp > weight) {
            return false;
        }

        return true;
    }

    private void crossBridge(int truck) {
        System.out.println(truck + "가 건너고 있습니다.");
    }

    private boolean canCrossBridge(int truck, int weight) {
        if (truck <= weight) {
            return true;
        }
        return false;
    }

    private int getTime(int count, int bridge_length) {
        if (count > bridge_length) {
            return count++;
        }
        return count;
    }

    public static void main(String[] args){
        new TruckMovingBridge().solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10});
    }
}
