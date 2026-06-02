package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;

public class FindGreaterTenAndAverage {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 12);
        double average = list.stream().filter(f -> f > 10).mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(average);
    }
}
