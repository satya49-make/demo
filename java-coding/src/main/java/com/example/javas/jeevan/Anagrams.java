package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagrams {
    public static void main(String[] args) {
        //String[] arr = {"act", "cat", "tac", "dog"};
        // if we have string array then just remove split method
        String str = "act cat tac dog";
        Map<String, List<String>> map = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));
        map.values().stream()
                .filter(list -> list.size() > 1)
                .forEach(System.out::println);
    }
}
