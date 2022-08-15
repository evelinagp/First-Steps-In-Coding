package com.Excercise6;

import java.util.Scanner;

public class SumPrimeNonPrimeEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        int nonPrimeSum = 0;
        int primeSum = 0;


        while (!line.equals("stop")) {
            int number = Integer.parseInt(line);
            boolean isNonPrime = false;

            if (number < 0) {
                System.out.println("Number is negative.");
                line = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isNonPrime = true;
                    break;
                }
            }
            if (isNonPrime) {
                nonPrimeSum += number;
            } else {
                primeSum += number;
            }
            line = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);

    }
}
