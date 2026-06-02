package com.example.javas;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Top20IntegerStreamQuestionsTest {

public static void main(String[] args) {
	List<Integer> ilst=List.of(4,21,88,12,5,14,35,62,21,12,43,11,24);
//	1. Find duplicate elements in a List<Integer>.
	//ilst.stream().filter(e->ilst.indexOf(e) != ilst.lastIndexOf(e)).distinct().forEach(System.out::println);
	//ilst.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	//.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).skip(1).forEach(System.out::println);
//
//	2. Remove duplicate elements from a List<Integer>.
	//ilst.stream().collect(Collectors.toSet()).forEach(System.out::print);
//
//	3. Find the frequency of each number in a List.
	//ilst.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
//
//	4. Find the maximum number in a List.
//	ilst.stream().max(Integer::compareTo).ifPresent(System.out::println);
//	ilst.stream().max((a,b)->a.compareTo(b)).ifPresent(System.out::println);
//	ilst.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);
//
//	5. Find the minimum number in a List.

//	ilst.stream().min(Integer::compareTo).ifPresent(System.out::println);
//	ilst.stream().min((a,b)->b.compareTo(a)).ifPresent(System.out::println);
//	ilst.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println);
//
//	6. Find the second largest number in a List.
	//ilst.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
//
//	7. Find the second smallest number in a List.
	//ilst.stream().sorted(Integer::compareTo).skip(1).findFirst().ifPresent(System.out::println);
//
//	8. Sort a List in ascending order.
	//ilst.stream().sorted(Integer::compareTo).forEach(System.out::println);
//
//	9. Sort a List in descending order.
	//ilst.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
//
//	10. Find all even numbers from a List.
	//ilst.stream().filter(e->e%2==0).forEach(System.out::println);
//
//	11. Find all odd numbers from a List.
	//ilst.stream().filter(e->e%2!=0).forEach(System.out::println);
//
//	12. Find sum of all elements in a List.
//	double sum=ilst.stream().mapToDouble(Integer::intValue).sum();
//	System.out.println(sum);
//
//	13. Find average of all elements in a List.
	//ilst.stream().mapToInt(Integer::intValue).average();
//
//	14. Find numbers starting with a specific digit.
//	    Example:
//	    Input: [12, 23, 34, 45, 56, 67]
//	    Digit: 2
//	    Output: [23]
	//ilst.stream().map(e->e.toString()).filter(e->e.startsWith("2")).forEach(System.out::println);
//
//	15. Find common elements between two Lists.
	List<Integer> l1=List.of(1,5,4,7,8);
//	List<Integer> l2=List.of(22,9,4,5,8,0);
//	l1.stream().filter(e->l2.contains(e)).forEach(System.out::println);
//
//	16. Find missing number from a sequence.
//	    Example:
//	    Input: [1,2,3,5]
//	    Output: 4
	//IntStream.rangeClosed(1, 10).filter(e->!l1.contains(e)).forEach(System.out::println);
//
//	17. Partition List into even and odd numbers.
	//ilst.stream().collect(Collectors.partitioningBy(e->e%2==0)).entrySet().forEach(System.out::println);
//
//	18. Find top 3 highest numbers from a List.
	//ilst.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
//
//	19. Find kth largest element in a List.
	//ilst.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().ifPresent(System.out::println);
//
//	20. Group numbers by even and odd.
//	    Output:
//	    Even -> [2,4,6]
//	    Odd -> [1,3,5]
	ilst.stream()
    .collect(Collectors.groupingBy(score -> {
        if (score >= 20) return "Grade A";
        else if (score >= 20) return "Grade B";
        else if (score >= 10) return "Grade C";
        else return "Grade D";
    })).entrySet().forEach(System.out::println);
	ilst.stream()
    .collect(Collectors.groupingBy(score -> {
        if (score >= 20) return "Grade A";
        else if (score >= 20) return "Grade B";
        else if (score >= 10) return "Grade C";
        else return "Grade D";
    },Collectors.counting())).entrySet().forEach(System.out::println);
		
}

}
