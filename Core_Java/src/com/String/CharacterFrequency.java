package com.String;

import java.util.HashMap;

public class CharacterFrequency {
    public static HashMap<Character, Integer> countFrequency(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> frequency = countFrequency(str);
        System.out.println("Character frequencies: " + frequency);
    }
}
