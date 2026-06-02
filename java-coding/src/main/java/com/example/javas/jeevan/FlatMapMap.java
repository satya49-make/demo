package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMap {
    public static void main(String[] args) {
        // map exmaple
        List<String> mapList = Arrays.asList("jeevan", "waykar");
        List<String> map = mapList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(map);

        // flatmap example
        List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(2, 5, 6, 7, 7), Arrays.asList(5, 67, 3, 46, 89));
        List<Integer> flatMap = listOfList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(flatMap);
    }

}
