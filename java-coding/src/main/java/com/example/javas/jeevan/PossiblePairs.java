package com.example.javas.jeevan;

import java.util.ArrayList;
import java.util.List;

public class PossiblePairs {
    public static void main(String[] args) {
        int[] arr = {5, 67, 4, 34, 5, 6, 3, 7};
        int target = 10;
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    pairs.add(new int[]{arr[i], arr[j]});
                    // System.out.println(arr[i] + " + " + arr[j] + " = " + (arr[i] + arr[j]));
                }
            }
        }
        for (int[] p : pairs) {
            System.out.println(p[0] + " + " + p[1] + " = " + (p[0] + p[1]));
        }
    }

}
