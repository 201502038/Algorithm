package com.company;

public class _4_dp {
    public static void main(String[] args) {
        int N = 5;
        long answer = 0;

        //피보나치 수열을 구현
        long[] sequence = new long[N];

        for (int i = 0; i < sequence.length; i++) {
            if (i == 0 || i == 1) {
                sequence[i] = 1;
                continue;
            }
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        answer = (sequence[sequence.length - 1] ) + (sequence[sequence.length - 2] * 2);
        System.out.println(answer);
    }
}
