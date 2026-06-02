package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "hello i love";
        String result = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join(" ", list);
                        }
                ));
        System.out.println(result);
    }
}
