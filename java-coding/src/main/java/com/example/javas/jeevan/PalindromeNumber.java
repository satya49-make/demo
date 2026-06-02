package com.example.javas.jeevan;

public class PalindromeNumber {
    public static void main(String[] args) {
        int numb = 121;
        boolean isPalindrome = numb == Integer.parseInt(
                new StringBuilder(String.valueOf(numb)).reverse().toString());
        System.out.println(isPalindrome ? "palindrome number" : "not palindrome number");
    }
}
