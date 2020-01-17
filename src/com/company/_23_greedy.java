package com.company;

public class _23_greedy {
    public static void main(String[] args) {
        String number = "4177252841";
        int k = 4;
        int idx = 0;
        char max;
        StringBuilder answer = new StringBuilder();

        if (number.charAt(0) == '0') System.out.println("0");
        for (int i = 0; i < number.length() - k; i++) {
            max = '0';
            for (int j = idx; j <= k + i; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j + 1;
                }
            }
            answer.append(max);
        }
        System.out.println(answer);
    }
}
