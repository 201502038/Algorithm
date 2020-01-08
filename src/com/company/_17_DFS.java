package com.company;

public class _17_DFS {
    //전역변수 사용하기
    static boolean[][] visit;

    public static void main(String[] args) {
        int n = 4;
        int[][] computers = {{1, 1, 1, 0}, {1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}};
        int answer = 0;
        visit = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            if (!visit[i][i]) {
                answer++;
                dfs(i, computers, n);
            }
        }
        System.out.println(answer);
    }

    public static void dfs(int i, int[][] computers, int n) {
        for (int j = 0; j < n; j++) {
            if (computers[i][j] == 1 && !visit[i][j]){
                visit[i][j] = visit[j][i] = true;
                dfs(j,computers,n);
            }
        }
    }
}
