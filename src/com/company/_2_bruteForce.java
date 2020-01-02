package com.company;

import java.util.ArrayList;

public class _2_bruteForce {
    public static void main(String[] args) {
        int[] answer = {1, 3, 2, 4, 2};
        ArrayList<Integer> result = new ArrayList();
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0, j = 0; i < answer.length; i++, j++) {
            if (j > a.length - 1) j = 0;
            if (answer[i] == a[j])
                p1++;
        }
        for (int i = 0, j = 0; i < answer.length; i++, j++) {
            if (j > b.length - 1) j = 0;
            if (answer[i] == b[j])
                p2++;
        }
        for (int i = 0, j = 0; i < answer.length; i++, j++) {
            if (j > c.length - 1) j = 0;
            if (answer[i] == c[j])
                p3++;
        }


        int mid = p1 > p2 ? p1 : p2;
        int top = p3 > mid ? p3 : mid;

        int[] p = new int[3];
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        for (int i = 0; i < 3; i++) {
            if ( top <= p[i])
                result.add(i+1);
        }

        int[] answers = new int[result.size()];

        for (int i = 0; i < answers.length; i++) {
            answers[i] = result.get(i);
        }

    }
}
