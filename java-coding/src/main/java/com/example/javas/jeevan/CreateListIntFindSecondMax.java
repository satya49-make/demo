package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//problem statement 
//find 3rd max number from list
class CreateListIntFindSecondMax {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(34, 56, 23, 56, 78, 98, 74, 30, 45);
        Optional<Integer> optional = listOfIntegers.stream().distinct().sorted((a, b) -> b - a).skip(2).findFirst();
        Integer num = optional.get();
        System.out.println(num);
    }
}