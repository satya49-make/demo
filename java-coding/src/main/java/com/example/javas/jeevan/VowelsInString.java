package com.example.javas.jeevan;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelsInString {
    public static void main(String[] args) {
        String input = "hello i am working";
        Map<Character, Integer> vowelCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount.put(c, vowelCount.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(vowelCount);
        Map<Character, Long> map = input.chars().filter(c -> "aeiou".indexOf(c) >= 0)
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(map);
    }
}
