package com.example.javas.code;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MainTest {

	public static void main(String[] args) {
		//List<Employee> empList=Employee.getEmployees();
//		System.out.println("Hello");
		List<Integer> ilist=List.of(13,12,67,44,96,22,41,11,24,25,12,13,12);
//		Basic Stream Questions
//		Find even numbers from a list.
		//ilist.stream().filter(e->e%2==0).collect(Collectors.toList()).forEach(System.out::println);
//		Find odd numbers from a list.
//		Find numbers starting with 1.
		//ilist.stream().map(String::valueOf).filter(e->e.startsWith("1")).forEach(System.out::println);
//		Find duplicate elements in a list.
		//Set<Integer> set= new HashSet<Integer>();
		//ilist.stream().filter(e-> !set.add(e)).forEach(System.out::println);
		//ilist.stream().filter(e-> Collections.frequency(ilist, e)>1).distinct().forEach(System.out::println);
//		ilist.stream().collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting())).entrySet()
//		.stream().filter(e->!(e.getValue()>1))
//		.map(Map.Entry::getKey)
//		.forEach(System.out::println);
//		Remove duplicates from list.
		//ilist.stream().distinct().forEach(System.out::println);
//		Find maximum number in list.
		ilist.stream().max(Integer::compareTo).ifPresent(System.out::println);
		ilist.stream().min((a,b)->a.compareTo(b)).ifPresent(System.out::println);
		ilist.stream().sorted(Integer::compareTo).forEach(System.out::println);
		ilist.stream().filter(e->e>30).count();
//		Find minimum number in list.
//		Sort numbers ascending order.
//		Sort numbers descending order.
//		Count total elements in list.
//		Find sum of all numbers.
//		Find average of numbers.
//		Find first element from list.
//		Find last element from list.
//		Skip first 5 numbers.
//		Limit stream to first 10 numbers.

	}
/**
* 100 Java 8 Coding Interview Questions
Basic Stream Questions
Find even numbers from a list.
Find odd numbers from a list.
Find numbers starting with 1.
Find duplicate elements in a list.
Remove duplicates from list.
Find maximum number in list.
Find minimum number in list.
Sort numbers ascending order.
Sort numbers descending order.
Count total elements in list.
Find sum of all numbers.
Find average of numbers.
Find first element from list.
Find last element from list.
Skip first 5 numbers.
Limit stream to first 10 numbers.
Convert list of strings to uppercase.
Convert list of strings to lowercase.
Join list of strings with comma.
Count empty strings in list.
*/
}
