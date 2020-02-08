package com.company;

import java.util.PriorityQueue;

public class _28_greedy {
    public static void main(String[] args) {
        int n = 4;
//        int[][] costs = {{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}};
        int[][] costs = {{0, 1, 5}, {1, 2, 3}, {2, 3, 3}, {3, 1, 2}, {3, 0, 4}};
        int answer = 0;

        Edge[] edges = new Edge[costs.length];

        for (int i = 0; i < costs.length; i++) {
            for (int j = 0; j < 3; j++) {
                edges[i] = new Edge(costs[i][0], costs[i][1], costs[i][2], false);
            }
        }

        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        for (Edge e : edges) {
            priorityQueue.add(e);
        }

        while (!priorityQueue.isEmpty()) {
            Edge e = priorityQueue.poll();
            if () {
                answer += e.cost;
            }
        }

        System.out.println(answer);
    }
    public static boolean visit(Edge e){

        return false;
    }
}

class Edge implements Comparable<Edge> {
    int src;
    int des;
    int cost;
    boolean visit;

    public Edge(int src, int des, int cost, boolean visit) {
        this.src = src;
        this.des = des;
        this.cost = cost;
        this.visit = visit;
    }

    public int compareTo(Edge o) {
        return cost <= o.cost ? -1 : 1;
    }
}