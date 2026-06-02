package com.example.javas.jeevan;

import java.util.*;

public class DuplicateIntegers<T> {
    List<T> ll = new LinkedList<T>();

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        list.stream().filter(n -> !seen.add(n) && duplicate.add(n)).forEach(System.out::println);
    }
}
