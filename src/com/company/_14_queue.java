package com.company;

import java.util.*;

public class _14_queue {
    public static void main(String[] args) {
        int[] answer = {};
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        float temp;

        Queue<Task> priorityQueue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            temp = speeds[i];
            temp = (100 - progresses[i]) / temp;
            int date = (int) Math.ceil(temp);
            Task task = new Task(date);
            priorityQueue.add(task);
        }
        int func = 0;
        List<Integer> list = new ArrayList<>();

        while (!priorityQueue.isEmpty()) {
            Task t = priorityQueue.poll();
            func++;
            while (priorityQueue.size() > 0 && t.completedDate >= priorityQueue.peek().completedDate) {
                priorityQueue.poll();
                func++;
            }
            list.add(func);
            func = 0;
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
    }

}

class Task {
    int completedDate;

    public Task(int completedDate) {
        this.completedDate = completedDate;
    }
}