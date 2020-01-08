package com.company;

import java.util.Arrays;

public class _18_greedy {
    public static void main(String[] args) {
        String number = "1924";
        int k = 2;
        String answer = "";
        int size = number.length();
        size = size - k;
        int idx = 0;
        while (size <= number.length()) {
            String s = number.substring(idx, size);
            char[] numbers = s.toCharArray();
            Arrays.sort(numbers);
            char c = numbers[numbers.length - 1];
            answer += c;
            idx = idx + s.indexOf(c) + 1;
            size = size;
        }
        System.out.println(answer);
    }
}
