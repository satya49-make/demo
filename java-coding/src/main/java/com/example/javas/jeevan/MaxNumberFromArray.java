package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;

public class MaxNumberFromArray {
    public static void main(String[] args) {
        int[] intArr = {56, 43, 23, 67, 89};
        int max = Arrays.stream(intArr).max().getAsInt();
        System.out.println(max);
        //if we have list
        List<Integer> list = Arrays.asList(56, 43, 23, 67, 89);
        int max1 = list.stream().max(Integer::compare).get();
        System.out.println(max1);
        //second max from int array
        int secondMax = Arrays.stream(intArr).distinct().boxed().sorted((a, b) -> b - a)
                .skip(1).findFirst().orElse(-1);
        System.out.println(secondMax);

    }
}
