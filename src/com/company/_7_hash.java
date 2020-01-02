package com.company;

import java.util.HashMap;

public class _7_hash {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "ana"};
        String[] completion = {"stanko", "ana"};
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            if (hashMap.containsKey(participant[i]))
                hashMap.put(participant[i], hashMap.get(participant[i]) + 1);
            else
                hashMap.put(participant[i], 1);
        }

        for (int i = 0; i < completion.length; i++) {
            if (hashMap.containsKey(completion[i]))
                hashMap.put(completion[i], hashMap.get(completion[i]) - 1);
        }

        for (int i = 0; i < hashMap.size(); i++) {
            int val = hashMap.get(participant[i]);
            if (val > 0)
                answer = participant[i];
        }
        System.out.println(answer);
    }
}
