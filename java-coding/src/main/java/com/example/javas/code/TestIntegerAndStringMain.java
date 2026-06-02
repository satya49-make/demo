package com.example.javas.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestIntegerAndStringMain {
	public static void main(String[] args) {
		
	List<Integer> intList = Arrays.asList(
		    10, 25, 30, 45, 50, 60, 75, 90, 100, 25, 30, 60
		);

		List<String> strList = Arrays.asList(
		    "Amit", "Neha", "Ankit", "Rahul", "Aman",
		    "Rohit", "Ankit", "Vikas", "Ajay", "Neha"
		);

//	==================== INTEGER QUESTIONS ====================
//
//	1. Find all even numbers from a list.
		//intList.stream().filter(e->e%2==0).forEach(System.out::println);
//	2. Find all odd numbers from a list.
		//intList.stream().filter(e->e%2 !=0).forEach(e-> System.out.print(e+" "));
//	3. Calculate the sum of all elements in a list.
//		int sum=intList.stream().reduce(0,(a,b)->a+b);
//		System.out.println(sum);
//		int sum1=intList.stream().mapToInt(e->e.intValue()).sum();
//		System.out.println(sum1);
//	4. Find the maximum element in a list.
//		intList.stream().max((a,b)->a.compareTo(b)).ifPresent(System.out::println);
//		intList.stream().max(Integer::compare).ifPresent(System.out::println);
//		intList.stream().mapToInt(Integer::intValue).max().ifPresent(System.out::println);
//	5. Find the minimum element in a list.
//		intList.stream().min((a,b)->a.compareTo(b)).ifPresent(System.out::println);
//		intList.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println);
//		intList.stream().min(Integer::compare).ifPresent(System.out::println);
//	6. Find the second highest number in a list.
//		intList.stream().distinct().sorted(Comparator.reverseOrder())
//		.skip(0).forEach(e-> System.out.print(e+" "));
//		strList.stream().distinct().sorted(Comparator.comparing(String::length).reversed())
//		.skip(0).forEach(e-> System.out.print(e+" "));
//	7. Remove duplicate elements from a list.
		//intList.stream().distinct().forEach(e-> System.out.print(e+" "));
//	8. Sort a list in ascending and descending order.
//		intList.stream().sorted().forEach(e-> System.out.print(e+" "));
//		intList.stream().sorted(Comparator.reverseOrder()).forEach(e-> System.out.print(e+" "));
//	9. Count elements greater than a given number (e.g., 50).
		//intList.stream().filter(e->e>50).forEach(e-> System.out.print(e+" "));
//	10. Find the average of all elements.
//		intList.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::print);
//		IntSummaryStatistics res=intList.stream().mapToInt(Integer::intValue).summaryStatistics();
//		System.out.println(res.getAverage());
//		System.out.println(res.getCount());
//		System.out.println(res.getSum());
//		System.out.println(res.getMax());
//	11. Retrieve the first element of a list.
//	12. Retrieve the last element of a list.
//	13. Check if any element matches a condition (e.g., > 100).
//	14. Check if all elements satisfy a condition (e.g., > 0).
//	15. Find the top 3 highest numbers in a list.
		//intList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(e-> System.out.print(e+" "));
//
//	==================== STRING QUESTIONS ====================
		// remove dup char
//		String str="banana";
//		String result = str.chars()
//		        .mapToObj(c -> (char) c)
//		        .distinct()
//		        .map(String::valueOf)
//		        .collect(Collectors.joining());
//
//		System.out.println(result); // ban
//
//	16. Convert all strings in a list to uppercase.
//	17. Convert all strings in a list to lowercase.
//	18. Filter strings that start with a specific character (e.g., 'A').
//	19. Sort strings by their length.
//	20. Find the longest string in a list.
//	21. Find the shortest string in a list.
//	22. Join all strings using a delimiter (e.g., comma).
//	23. Count the frequency of each word in a list.
//	24. Identify duplicate strings in a list.
//	25. Remove duplicate strings from a list.
//	26. Find strings containing a specific substring (e.g., 'a').
//	27. Reverse each string in a list.
//	28. Sort strings alphabetically.
//	29. Check if any string starts with a specific character (e.g., 'Z').
//	30. Retrieve the first string from a list.
		
//		Java 8 – 15 Character/String Interview Questions
		String str = "programming";
//		1. Count frequency of each character in a string.
//		str.chars().mapToObj(c->(char)c)
//		.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
//		.entrySet().stream()
//		.forEach(e-> System.out.println(e.getKey()+"-"+e.getValue()));
		
//		2. Find the first non-repeated character in a string.
//		str.chars().mapToObj(c->(char)c)
//		.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
//		.entrySet().stream()
//        .filter(e -> e.getValue() == 1)
//        .map(Map.Entry::getKey)
//        .findFirst().ifPresent(System.out::println);
        
//		3. Find the first repeated character in a string.
//		str.chars().mapToObj(c -> (char)c)
//		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
//		.entrySet().stream()
//		.filter(e-> e.getValue()>1)
//		.map(Map.Entry::getKey)
//		.findFirst().ifPresent(System.out::println);
		
//		4. Find the most frequent character in a string.
//		str.chars().mapToObj(c -> (char)c)
//		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
//		.entrySet().stream()
//		.max(Map.Entry.comparingByValue())
//		.map(Map.Entry::getKey)
//		.ifPresent(System.out::println);
//		5. Count the number of vowels in a string.
//		long count=str.toLowerCase().chars().mapToObj(c->(char)c)
//		.filter(c-> "aeiou".indexOf(c) !=-1)
//		.count();
//		System.out.println(count);
//		6. Remove duplicate characters from a string.
//		String s=str.chars().mapToObj(c->(char)c)
//		.distinct().map(String::valueOf)
//		.collect(Collectors.joining());
//		System.out.println(s);
//		7. Sort characters in a string based on their frequency.
		
//		String res=str.chars().mapToObj(c->(char)c)
//		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//		.entrySet().stream()
//		.sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
//		.map(e->String.valueOf(e))
//		.collect(Collectors.joining(","));
//		System.out.println(res);
		
//		8. Check if a string is a palindrome.
		//"madam".chars().filter(null)
//		9. Reverse a string using Stream API.
//		String str1="hello";
//		String s1=IntStream.range(0, str1.length())
//		.mapToObj(i->str1.charAt(str1.length()-1-i))
//		.map(String::valueOf)
//		.collect(Collectors.joining());
//		System.out.println(s1);
//		// 2nd method================
//		char[] arr=str1.toCharArray();
//		int left=0, right=str1.length()-1;
//		
//		while (left < right) {
//		    char temp = arr[left];
//		    arr[left] = arr[right];
//		    arr[right] = temp;
//		    left++;
//		    right--;
//		}
//		System.out.println(arr);
		
		//10. Find all duplicate characters in a string.
		Set<Character> duplicates = str.chars()
		        .mapToObj(c -> (char) c)
		        .filter(c -> str.indexOf(c) != str.lastIndexOf(c))
		        .collect(Collectors.toSet());
		System.out.println(duplicates);
////		11. Create a frequency map sorted by character.
//		Map<Character, Long> map = str.chars()
//		        .mapToObj(c -> (char) c)
//		        .collect(Collectors.groupingBy(
//		                c -> c,
//		                TreeMap::new,
//		                Collectors.counting()
//		        ));
//		12. Count the number of consonants in a string.
//		13. Check if two strings are anagrams of each other.
//		14. Find the second most frequent character in a string.
//		15. Replace all duplicate characters with a specific symbol (e.g., '*').
//		==========================================================
		//paralleStream
		IntStream.range(0, 20).parallel().forEach(i-> System.out.println("Thread name-> "+Thread.currentThread().getName()+"=>"+i));
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(ForkJoinPool.commonPool().getParallelism());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
