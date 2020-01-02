package com.company;

import java.util.*;

public class _5_graph {
    public static void main(String[] args) {
        int answer = 0;
        int n = 6;
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        boolean[][] adj = new boolean[n][n];
        boolean[] visit = new boolean[n];

        for (int i = 0; i < edge.length; i++) {
            adj[edge[i][0] - 1][edge[i][1] - 1] = adj[edge[i][1] - 1][edge[i][0] - 1] = true;
        }

        Queue<Integer> Queue = new LinkedList<>();
        List<Integer> nextNodes = new ArrayList<>();
        visit[0] = true;
        Queue.add(0);
        while (true) {
            answer = Queue.size();
            while (!Queue.isEmpty()) {
                int i = Queue.poll();
                for (int j = 0; j < n; j++) {
                    if (adj[i][j] && !visit[j]) {
                        visit[j] = true;
                        nextNodes.add(j);
                    }
                }
            }
            if (nextNodes.isEmpty())
                break;

            Queue.addAll(nextNodes);
            nextNodes.clear();
        }

        System.out.println(answer);
    }
}
