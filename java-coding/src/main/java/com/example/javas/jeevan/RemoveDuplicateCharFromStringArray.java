package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicateCharFromStringArray {
    public static void main(String[] args) {
        String[] strArr = {"jeevan", "dnyanoba", "waykar"};
        // remove duplicate char from word
        Arrays.stream(strArr).map(word -> word.chars()
                .distinct().mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining())).forEach(System.out::println);
        //count of each word from String
        Map<String, Long> map = Arrays.stream(strArr)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }

}
