package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class _19_sort {
    public static void main(String[] args) {
        int[] numbers = {0, 0, 0, 0};
        String answer = "";
        String[] arr = new String[numbers.length];
//        String[] arr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
//        for (int i = 0; i < numbers.length; i++) {
//            arr[i] = Integer.toString(numbers[i]);
//        }
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = (String.valueOf(numbers[i]));
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1 + s2).compareTo(s2 + s1);
            }
        });

        if (arr[0].equals("0"))
            System.out.println("0");

        for (int i = arr.length - 1; i >= 0; i--) {
            answer += arr[i];
        }
        System.out.println(answer);
    }
}