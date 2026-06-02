package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordWithSamePlace {
    public static void main(String[] args) {
        String str = "hello hi";
        String result = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }

}
