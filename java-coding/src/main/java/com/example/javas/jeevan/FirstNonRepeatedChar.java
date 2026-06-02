package com.example.javas.jeevan;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "switch";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        map.entrySet().stream().filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);
    }
}
