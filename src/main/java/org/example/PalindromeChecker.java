package org.example;

public class PalindromeChecker {

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String input) {
        // Remove spaces and convert the string to lowercase for case-insensitive comparison
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Use two pointers for comparison
        int start = 0;
        int end = cleanedInput.length() - 1;

        // Check if the characters at the pointers are equal and move the pointers towards each other
        while (start < end) {
            if (cleanedInput.charAt(start) != cleanedInput.charAt(end)) {
                // Characters don't match, not a palindrome
                return false;
            }
            start++;
            end--;
        }

        // All characters matched, it's a palindrome
        return true;
    }
}