package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


public static boolean checkForPalindrome(String str) {

    String cleanStr = cleanString(str);


    String reversedStr = reverseString(cleanStr);


    return cleanStr.equals(reversedStr);
}


private static String cleanString(String str) {
    return str.replaceAll("[^a-zA-Z]", "").toLowerCase();
}


private static String reverseString(String str) {
    return new StringBuilder(str).reverse().toString();
}
}