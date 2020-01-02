package com.company;

public class _6_greedy {
    public static void main(String[] args) {
        int answer = 0;
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};
        int[] array = new int[n];


        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }

        for (int i = 0; i < lost.length; i++) {
            array[lost[i] - 1] = array[lost[i] - 1] - 1;
        }
        for (int i = 0; i < reserve.length; i++) {
            array[reserve[i] - 1] = array[reserve[i] - 1] + 1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                if (i - 1 >= 0) {
                    if (array[i - 1] == 2) {
                        array[i - 1] = 1;
                        array[i] = 1;
                        continue;
                    }
                }

                if (i + 1 < array.length) {
                    if (array[i + 1] == 2) {
                        array[i + 1] = 1;
                        array[i] = 1;
                        continue;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0)
                answer++;
        }

    }
}
