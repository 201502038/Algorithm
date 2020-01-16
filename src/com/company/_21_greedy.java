package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _21_greedy {
    public static void main(String[] args) {
        int answer = 0;
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        List<Integer> p = Arrays.stream(people).boxed().collect(Collectors.toList());
        p.sort(Comparator.reverseOrder());


    }
}
