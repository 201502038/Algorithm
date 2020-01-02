package com.company;

import java.util.Arrays;

public class _9_sort {
    public static void main(String[] args) {
        //사용할 변수를 확실하게 정리
        //세세한 의사코드 구현
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];


        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1] );
            Arrays.sort(temp);
            int x = temp[commands[i][2] - 1];
            answer[i] = x;
        }

        System.out.println(answer[2]);

    }
}
