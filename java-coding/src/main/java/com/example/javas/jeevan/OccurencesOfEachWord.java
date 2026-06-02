package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurencesOfEachWord {
    public static void main(String[] args) {
        String[] stringArray = {"hello", "go", "test", "go"};
        Map<String, Long> map = Arrays.stream(stringArray).collect(Collectors
                .groupingBy(s -> s, Collectors.counting()));
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
