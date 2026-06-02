package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;

public class MapExampleTransformEachEle {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("john", "kane");
        List<String> map = name.stream().map(String::toUpperCase).toList();
        map.forEach(System.out::println);
    }

}
