package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionEvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenList = list.stream().filter(even -> even % 2 == 0).collect(Collectors.toList());
        List<Integer> oddList = list.stream().filter(odd -> odd % 2 == 1).collect(Collectors.toList());
        System.out.println(evenList);
        System.out.println(oddList);
    }
}
