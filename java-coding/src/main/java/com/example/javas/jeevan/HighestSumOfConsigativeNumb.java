package com.example.javas.jeevan;

public class HighestSumOfConsigativeNumb {
    public static void main(String[] args) {
        int[] intArr = {450, 32, 23, 68, 89};
        System.out.println(solution(intArr));
    }

    private static int solution(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            int sum = A[i] + A[i + 1];
            max = Math.max(max, sum);
        }
        return max;
    }
}