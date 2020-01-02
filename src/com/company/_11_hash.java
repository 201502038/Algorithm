package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class _11_hash {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean answer = true;
        Arrays.sort(phone_book);
        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            String phone = phone_book[i].replaceAll(" ", "");
            for (int j = 0; j <= phone.length(); j++) {
                String s = phone.substring(0, j);
                if (hashMap.containsKey(s)) {
                    answer = false;
                }
            }
            hashMap.put(phone_book[i], phone_book[i]);
        }
        System.out.println(answer);
    }
}
