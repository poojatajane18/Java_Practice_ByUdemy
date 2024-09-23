package com.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static Character findFirstNonRepeated(String str) {
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "swiss";
        Character result = findFirstNonRepeated(str);
        System.out.println("First non-repeated character: " + (result != null ? result : "None"));
    }
}
