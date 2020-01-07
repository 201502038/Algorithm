package com.company;

import java.util.HashSet;

public class _15_bruteForce {
    public static void main(String[] args) {

        String numbers = "17";
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        //순열 알고리즘의 이해
    }
    public static boolean[] prime() {
        boolean[] primes = new boolean[10000000];
        primes[0] = primes[1] = true;
        for(int i = 2; i < primes.length; i++) {
            if(!primes[i]) {
                for(int j = 2; j * i < primes.length; j++) {
                    primes[j * i] = true;
                }
            }
        }

        return primes;
    }
}