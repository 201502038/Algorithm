package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class _20_queue {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int answer = 0;
        Queue<Document> queue1 = new LinkedList();
        Queue<Document> queue2 = new LinkedList();
        Queue<Document> queue3 = new LinkedList();

        for (int i = 0; i < priorities.length; i++) {
            Document document = new Document(priorities[i], i);
            queue1.add(document);
        }

        while (queue3.size() != priorities.length) {
            for (int i = 0; i < queue1.size(); i++) {
                Document d = queue1.poll();
                if (d.priority < getMaxValue(queue1)) {
                    queue2.add(d);
                } else {
                    queue3.add(d);
                    break;
                }
            }
            queue1.addAll(queue2);
            queue2.clear();
        }

        for (int i = 0; i < priorities.length; i++) {
            Document d = queue3.poll();
            if (d.location == location)
                answer = i+1;
        }

        System.out.println(answer);

    }
    private static int getMaxValue(Queue<Document> queue) {
        int max = 0;

        for (Document d : queue) {
            if (d.priority > max) {
                max = d.priority;
            }
        }
        return max;
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