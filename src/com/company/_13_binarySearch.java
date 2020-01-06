package com.company;

import java.util.Arrays;

public class _13_binarySearch {
    public static void main(String[] args) {
        long answer = 0;
        int n = 6;
        int[] times = {7, 10};

        long start = 0;
        long end = Long.MAX_VALUE / 2;

        while (start <= end) {
            long mid = (start + end) / 2;
            long people = n;
            for (int time : times) {
                people -= mid / time;
                if (people < 0) break;
            }
            if (people > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
                answer = mid;
            }
        }
    }

}

