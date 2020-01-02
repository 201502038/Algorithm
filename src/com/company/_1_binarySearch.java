package com.company;
import java.util.Arrays;

public class _1_binarySearch {
    public static void main(String[] args) {
        int answer = 0;
        int[] budgets = {120, 110, 140, 150};
        int M = 485;
        Arrays.sort(budgets);
        int min = 0;
        int max = M;
        int mid = 0;
        int premid = 0;
        long sum = 0;

        //예산의 최대치를 구함
        for (int i = 0; i < budgets.length; i++) {
            sum += budgets[i];
        }

        if (sum <= M) {
            answer = budgets[budgets.length - 1];
            System.out.println(answer);
        } else {
            while (true) {
                sum = 0;
                mid = (min + max) / 2;
                if (mid == premid) break;

                for (int i = 0; i < budgets.length; i++) {
                    if (mid <= budgets[i]) {
                        sum += mid * (budgets.length - i);
                        break;
                    } else {
                        sum += budgets[i];
                    }
                }
                if (sum <= M){
                    min =  mid;
                }else {
                    max =  mid;
                }
                premid = mid;
            }
            answer = mid;
        }
        System.out.println(answer);

    }
}
