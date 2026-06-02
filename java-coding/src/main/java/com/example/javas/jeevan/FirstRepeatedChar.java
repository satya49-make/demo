package com.example.javas.jeevan;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String str = "programming";
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!set.add(ch)) {
                System.out.println(ch);
                break;
            }
        }
    }
}
