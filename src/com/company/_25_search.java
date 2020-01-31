package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _25_search {
    private static Map<String, Integer> minCountMap;
    private static int MAX_COUNT;

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", " dog", "lot", " log", " cog"};
        int answer = 0;
        minCountMap = new HashMap<>();
        MAX_COUNT = words.length;
        Set<Word> wordSet = new HashSet<>();

        for (String word : words) {
            Word wordObj = new Word();

            wordObj.word = word;
            wordObj.used = false;

            wordSet.add(wordObj);
        }
        answer = getMinCount(begin, target, wordSet);

        if (answer > MAX_COUNT) { // no way
            System.out.println("0");

        }
    }

    private static int getMinCount(String begin, String target, Set<Word> wordSet) {
        Integer minCount = minCountMap.get(begin);

        if (minCount == null) {
            minCount = MAX_COUNT + 1;
        }

        for (Word word : wordSet) {
            if (word.used || !isNext(begin, word.word)) {
                continue;
            }

            if (target.equals(word.word)) {
                minCount = 1;
                break;
            }

            word.used = true;
            int count = getMinCount(word.word, target, wordSet) + 1;
            word.used = false;

            if (count < minCount) {
                minCount = count;
            }
        }
        minCountMap.put(begin, minCount);
        return minCount;

    }

    private static boolean isNext(String a, String b) {
        int diffCount = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diffCount++;

                if (diffCount > 1) {
                    return false;
                }
            }
        }
        return true;
    }


}

class Word {
    String word;
    boolean used;

    @Override
    public int hashCode() {
        return word.hashCode();
    }
}
