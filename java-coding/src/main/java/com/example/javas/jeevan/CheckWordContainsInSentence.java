package com.example.javas.jeevan;

import java.util.Arrays;

public class CheckWordContainsInSentence {
    public static void main(String[] args) {
        String sentence = "hello i am working tech company";
        String word = "am";
        boolean str = Arrays.stream(sentence.split(" ")).anyMatch(w -> w.equalsIgnoreCase(word));
        System.out.println(str);
    }

}
