package com.example.javas.jeevan;

public class Factorial {
    public static void main(String[] args) {
        int numb = 5;
        System.out.println(" " + factorial(numb));

    }

    public static long factorial(int numb) {
        if (numb == 0 || numb == 1)
            return 1;
        return numb * factorial(numb - 1);
    }
}
