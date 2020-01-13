package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class _20_queue {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        Queue<Document> queue1 = new LinkedList();
        Queue<Document> queue2 = new LinkedList();

        for (int i = 0; i < priorities.length; i++) {
            Document document = new Document(priorities[i], i);
            queue1.add(document);
        }


        while (true) {
            Document d = queue1.poll();
            if (d.priority < getMaxValue(queue1)){
                queue2.add(d);
            }

            queue1.addAll(queue2);
            queue2.clear();
        }
    }

    private static int getMaxValue(Queue<Document> queue) {
        return 0;
    }
}

class Document {
    int priority;
    int location;

    public Document(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }
}