package com.example.javas.jeevan;

import java.util.ArrayList;
import java.util.List;

public class FindLengthUpperCaseStringList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("jeevan");
        //list of string filter the element which having length is 5 and do uppercase
        List<String> li = list.stream().filter(fil -> fil.length() == 5)
                .map(String::toUpperCase).toList();
        li.forEach(System.out::println);

    }
}
