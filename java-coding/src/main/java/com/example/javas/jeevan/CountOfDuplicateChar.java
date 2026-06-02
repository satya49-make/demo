package com.example.javas.jeevan;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfDuplicateChar {
    public static void main(String[] args) {
        String str = "hello jeevan";

        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().filter(e -> e.getValue() > 1).forEach(System.out::println);

    }

}
