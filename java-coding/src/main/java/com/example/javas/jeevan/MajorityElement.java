package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {5, 67, 56, 5, 76, 5, 5};
        Map<Integer, Long> map = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().filter(e -> e.getValue() > arr.length / 2)
                .forEach(System.out::println);
    }
}
