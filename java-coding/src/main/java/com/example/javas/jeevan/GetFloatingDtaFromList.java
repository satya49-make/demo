package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetFloatingDtaFromList {
    public static void main(String[] args) {
        List<Number> list = Arrays.asList(1, 2, 3, 4, 5, 6.6, 7.6, 8.6, 9, 10);
        list.stream().filter(n -> n instanceof Double)
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
