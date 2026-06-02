package com.example.javas.jeevan;

import java.util.stream.Collectors;

public class RemoveDuplicateCharFromString {
    public static void main(String[] args) {
        String str = "hello";
        String res = str.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(res);

    }
}
