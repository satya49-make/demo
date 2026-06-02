package com.example.javas.jeevan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOFListIntoSingleList {
    public static void main(String[] args) {
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("dot net", "java", "python"),
                Arrays.asList("node", "nodeJs", "js"),
                Arrays.asList("MySql", "MongoDB", "mainframe")
        );
        //System.out.println(listOfList);
        List<String> singleList = listOfList.stream().flatMap(skills -> skills.stream()).collect(Collectors.toList());
        System.out.println(singleList);
        List<String> startWithS = singleList.stream().filter(skills -> skills.toLowerCase().startsWith("m")).collect(Collectors.toList());
        System.out.println(startWithS);
    }

}
