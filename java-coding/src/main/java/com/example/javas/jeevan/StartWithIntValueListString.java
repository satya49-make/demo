package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithIntValueListString {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("Zero", "3hree", "1ne", "hello", "2wo", "fail");
        // listString.stream().filter(f -> f.matches("\\d.*")).collect(Collectors.toList()).forEach(System.out::println);
        listString.stream().filter(f -> f.matches("[a-zA-Z].*")).collect(Collectors.toList()).forEach(System.out::println);
    }
}
