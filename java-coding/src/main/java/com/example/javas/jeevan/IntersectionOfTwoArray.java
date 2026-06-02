package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        Integer[] int1 = {4, 6, 7, 5, 3};
        Integer[] int2 = {4, 9, 2, 6, 3};
        List<Integer> list1 = Arrays.asList(int1);
        List<Integer> list2 = Arrays.asList(int2);
        List<Integer> intersection = list1.stream().filter(list2::contains).distinct().collect(Collectors.toList());
        System.out.println(intersection);

    }

}
