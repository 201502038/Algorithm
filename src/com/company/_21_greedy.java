package com.company;

import java.util.Arrays;

public class _21_greedy {
    public static void main(String[] args) {
        int answer = 1;
        int[] people = {30, 50, 50, 70};
        int limit = 100;

        Arrays.sort(people);

        int index = people.length - 1;
        for(int i = 0; i <= index; i++, answer++){
            while(index > i && people[i] + people[index--] > limit)
                answer++;
        }



    }
}
