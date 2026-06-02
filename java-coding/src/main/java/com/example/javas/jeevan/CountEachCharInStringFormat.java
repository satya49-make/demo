package com.example.javas.jeevan;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharInStringFormat {
    public static void main(String[] args) {
        String str = "aabbbcccc";
        StringBuffer sb = new StringBuffer();
        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((c, l) -> sb.append(c).append(l));
        System.out.println(sb.toString());
    }
}
