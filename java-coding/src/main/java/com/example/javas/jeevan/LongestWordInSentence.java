package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordInSentence {
    public static void main(String[] args) {
        String input = "hello i am working";
        String output = Arrays.stream(input.split(" ")).max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(output);
    }

}