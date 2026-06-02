package com.example.javas.jeevan;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 17;
        boolean primeNumber = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                primeNumber = false;
                break;
            }
        }
        System.out.println(primeNumber ? "palindrome" : "not palindrome");
    }
}
