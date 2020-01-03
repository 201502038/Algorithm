package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class _12_stackAndQueue {
    public static void main(String[] args) {
        int answer = 0;
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

    }

    static int queueValue(Queue<Integer> queue) {
        int sum = 0;
        while (!queue.isEmpty())
            sum += queue.poll();
        return sum;
    }
}
