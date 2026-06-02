package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.Comparator;

public class LongestSecondWordFromStirng {
    public static void main(String[] args) {
        String input = "hello i am working";
        String str = Arrays.stream(input.split(" ")).sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get();
        System.out.println(str);
        Integer str1 = Arrays.stream(input.split(" ")).map(r -> r.length()).sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(str1);
    }
}
