package com.company;

public class _3_dfs {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int answer = findTarget(numbers, 0, 0, target);
        System.out.println(answer);
    }

    public static int findTarget(int[] numbers, int result, int index, int target) {
        if (index == numbers.length)
            if (result == target)
                return 1;
            else
                return 0;
        else
            return findTarget(numbers, result + numbers[index], index + 1, target)
                    + findTarget(numbers, result - numbers[index], index + 1, target);

    }
}