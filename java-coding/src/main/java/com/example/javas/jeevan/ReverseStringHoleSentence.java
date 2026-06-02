package com.example.javas.jeevan;

public class ReverseStringHoleSentence {
    public static void main(String[] args) {
        String input = "hello hi";
        String out = input.chars().mapToObj(c -> String.valueOf((char) c))
                .reduce("", (a, b) -> b + a);
        System.out.println(out);
    }

}
