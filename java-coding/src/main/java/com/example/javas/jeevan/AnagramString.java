package com.example.javas.jeevan;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean result = isAnagram(str1, str2);
        System.out.println(result);
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);

    }
}
