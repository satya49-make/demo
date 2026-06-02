package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindListOfIntegerFromListStringArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("56", "45", "crt");
        List<Integer> li = list.stream().filter(f -> f.matches("\\d+")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(li);
    }

}
