package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortInteger {

    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(56, 34, 67, 89, 156, 45, 78);
        List<Integer> sorted = listOfInteger.stream().sorted(Comparator.reverseOrder()).toList();
        sorted.forEach(System.out::println);
    }
}
