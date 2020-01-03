package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class _12_stackAndQueue {
    public static void main(String[] args) {
        int answer = 0;
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        int sec = 0;
        Queue<Truck> queue1 = new LinkedList<>();
        Queue<Truck> queue2 = new LinkedList<>();

        for (int i : truck_weights) {
            queue1.add(new Truck(i, 0));
        }

        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            sec++;
            Truck doneTruck = null;
            int sum = 0;
            for (Truck truck : queue2) {
                sum += truck.weight;
                truck.position++;

                if (truck.position > bridge_length) {
                    doneTruck = truck;
                }
            }
            if (doneTruck != null) {
                queue2.remove(doneTruck);
                sum -= doneTruck.weight;
            }
            if (!queue1.isEmpty()) {
                Truck truck = queue1.peek();
                if (truck.weight + sum <= weight) {
                    queue1.remove(truck);
                    queue2.add(truck);
                    truck.position++;
                }
            }
        }
        System.out.println(sec);
    }
}

class Truck {
    int weight;
    int position;

    public Truck(int truck_weight, int i) {
        this.position = i;
        this.weight = truck_weight;
    }
}