package com.example.javas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Top20StringStreamQuestionsTest {
public static void main(String[] args) {
	String str="programmming";
	//1. Reverse a String without using built-in reverse() method.
	String s=IntStream.rangeClosed(0, str.length()-1).mapToObj(e->str.charAt(str.length()-1-e)).map(String::valueOf).collect(Collectors.joining());
	System.out.println(s);

	//2. Check whether a String is Palindrome.
	System.out.println(s.equals(str));

	//3. Find duplicate characters in a String.
	str.chars().mapToObj(e -> (char)e).filter(e->str.indexOf(e)!=str.lastIndexOf(e)).distinct().forEach(System.out::println);
	str.chars().mapToObj(c-> (char)c).map(String::valueOf).
	collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);

	//4. Count occurrence of each character in a String.
	str.chars().mapToObj(c-> (char)c).map(String::valueOf).collect(Collectors.groupingBy(e->e,Collectors.counting()))
	.entrySet().forEach(System.out::println);

	//5. Find first non-repeated character in a String.
	str.chars().mapToObj(c-> (char)c).map(String::valueOf).collect(Collectors.groupingBy(e->e,LinkedHashMap::new ,Collectors.counting()))
	.entrySet().stream().filter(e->e.getValue()==1).findFirst().ifPresent(System.out::println);

	//6. Find first repeated character in a String.	
	str.chars().mapToObj(c-> (char)c).map(String::valueOf)
	.collect(Collectors.groupingBy(e->e,LinkedHashMap::new ,Collectors.counting()))
	.entrySet().stream().filter(e->e.getValue()>1).findFirst().ifPresent(System.out::println);
	
	//7. Remove duplicate characters from a String.
	str.chars().mapToObj(c->(char)c).map(String::valueOf).distinct().forEach(System.out::println);

	//8. Count vowels and consonants in a String.
	str.toLowerCase().chars().mapToObj(c->(char)c).map(String::valueOf).collect(Collectors.groupingBy(
			e->{
				if("eaiou".contains(e)) return "vowels";
				else return "consonants";
			}, Collectors.counting()
			) ).entrySet().forEach(System.out::println);

	//9. Find frequency of each word in a sentence.
	String[] s2=str.split(" ");
	Stream.of(s2).collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting())).entrySet().forEach(System.out::println);

	//10. Reverse each word in a sentence.
//	    Example:
//	    Input: "Java is awesome"
//	    Output: "avaJ si emosewa"
	String input = "Java is awesome";
	String output = Arrays.stream(input.split(" "))
	    .map(word -> IntStream.range(0, word.length())
	                          .mapToObj(i -> word.charAt(word.length() - 1 - i))
	                          .map(String::valueOf)
	                          .collect(Collectors.joining()))
	    .collect(Collectors.joining(" "));
	   System.out.println(output);

	//11. Reverse word order in a sentence.
//	    Example:
//	    Input: "Java is awesome"
//	    Output: "awesome is Java"
    String output2 = Arrays.stream(input.split(" "))   // split into words
            .collect(Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    Collections.reverse(list);            // reverse the list of words
                    return String.join(" ", list);        // join back into a sentence
                }
            ));

        System.out.println(output2); // awesome is Java

	//12. Check if two Strings are Anagrams.char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr1 = "tsaya".toLowerCase().toCharArray();
        char[] arr2 = "satya".toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
         Arrays.equals(arr1, arr2);
    

	//13. Find the longest word in a sentence.
	Arrays.stream(str.split(" "))
	.sorted(Comparator.comparing(String::length).reversed()).findFirst().ifPresent(System.out::println);

	//14. Find the longest substring without repeating characters.

	//15. Find all duplicate words in a sentence.

	//16. Remove all whitespace from a String.

	//17. Find all permutations of a String.

	//18. Sort characters of a String alphabetically.
	str.chars().mapToObj(c-> (char)c).sorted().forEach(System.out::println);

	//19. Count uppercase, lowercase, digits, and special characters.
	String str1 = "Hello123@World";
	long upper = str1.chars().filter(Character::isUpperCase).count();
	long lower = str1.chars().filter(Character::isLowerCase).count();
	long digits = str1.chars().filter(Character::isDigit).count();
	long special = str1.length() - (upper + lower + digits);

	System.out.println("Uppercase: " + upper);
	System.out.println("Lowercase: " + lower);
	System.out.println("Digits: " + digits);
	System.out.println("Special: " + special);


	//20. Find the second most frequent character in a String.
	str.chars().mapToObj(c-> (char)c).map(String::valueOf)
	.collect(Collectors.groupingBy(e->e,Collectors.counting()))
	.entrySet().stream()
	.sorted(Map.Entry.<String,Long>comparingByValue().reversed())
	.forEach(System.out::println);
}
}
