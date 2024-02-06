package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

    // Method to generate the first n prime numbers
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int number = 2; // Starting from the first prime number

        while (count < n) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number++;
        }

        return primes;
    }

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // Check for divisibility up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not a prime number
            }
        }

        return true; // No divisors found, it's a prime number
    }
}