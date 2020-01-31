package com.company;

import java.util.Arrays;
import java.util.Collections;

public class _27_sort {
    public static void main(String[] args) {
        int[] citations = {20, 19, 18, 1};
        int answer = 0;

        Integer[] in = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(in, Collections.reverseOrder());

        for (int i = 0; i < in.length; i++) {
            if (in[i] <= answer)
                break;
            answer = i + 1;
        }

        System.out.println(answer);
    }
}
