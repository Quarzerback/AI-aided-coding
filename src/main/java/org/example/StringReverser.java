package org.example;

public class StringReverser {

    // Method to reverse a given string
    public static String reverseString(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize pointers for the start and end of the array
        int start = 0;
        int end = charArray.length - 1;

        // Swap characters from start to end until both pointers meet
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}