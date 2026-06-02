package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckNullEmptyBlankStringUpdateString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", null, "", "hello", " ", "java");
        List<String> li = list.stream().map(m -> m == null ? "java" : m.isBlank() ? "java 8" : m).collect(Collectors.toList());
        System.out.println(li);
    }
}
