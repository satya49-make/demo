package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLengthString {
    public static void main(String[] args) {
        String[] arr = {"hello", "hi", "go"};
        Map<Integer, List<String>> list = Arrays.stream(arr).collect(Collectors.groupingBy(String::length));
        System.out.println(list);


    }
}
