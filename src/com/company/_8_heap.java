package com.company;

import java.util.PriorityQueue;

public class _8_heap {
    public static void main(String[] args) {
        int answer = 0;
        int[] scoville = {0,0,2};
        int K = 2;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(scoville.length);

        for (int i = 0; i < scoville.length; i++) {
            priorityQueue.add(scoville[i]);
        }

        //사용할 변수를 나눈다.
        while (priorityQueue.size() > 1) {
            if (priorityQueue.peek() >= K)
                System.out.println(answer);
            int x = priorityQueue.poll();
            int y = priorityQueue.poll();
            int z = x + 2 * y;
            answer++;
            priorityQueue.offer(z);
        }

        if (priorityQueue.poll() < K)
            return;

        System.out.println(answer);
    }
}
