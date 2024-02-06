package org.example;

import java.util.List;

import static org.example.PalindromeChecker.isPalindrome;
import static org.example.PrimeNumberGenerator.generatePrimes;
import static org.example.StringReverser.reverseString;

public class Main {
    public static void main(String[] args) {

        // Example of using the reverseString method
        String originalString = "Hello";
        String reversedString = reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);

        // Example of using the isPalindrome method
        String palindromeString = "anna";
        boolean isPalindrome = isPalindrome(palindromeString);
        System.out.println("Is \"" + palindromeString + "\" a palindrome? " + isPalindrome);

        // Example of using the generatePrimes method
        int n = 10;
        List<Integer> primeNumbers = generatePrimes(n);
        System.out.println("First " + n + " prime numbers: " + primeNumbers);
    }
}