package com.company;

public class _10_stackAndQueue {
    public static void main(String[] args) {
        int[] heights = {6, 9, 5, 7, 4};
        int[] answer = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            int h = heights[i];
            for (int j = 0; j < i; j++) {
                if (h < heights[j]) {
                    answer[i] = j + 1;
                }
            }
        }
    }
}
