package com.Exsercise4.Ex;

import java.util.Scanner;

public class OddOrEvenPositionEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPositions = Integer.parseInt(scanner.nextLine());
        double evenMin = Double.MAX_VALUE;
        double evenMax = -100000000;
        double evenSum = 0.0;

        double oddMin = Double.MAX_VALUE;
        double oddMax = -100000000;
        double oddSum = 0.0;

        boolean isEvenMax = false;
        boolean isEvenMin = false;
        boolean isOddMax = false;
        boolean isOddMin = false;

        for (int i = 1; i <= numberOfPositions; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += number;

                if (number < evenMin) {
                    evenMin = number;
                    isEvenMin = true;
                }

                if (number > evenMax) {
                    evenMax = number;
                    isEvenMax = true;

                }
            } else {
                oddSum += number;

                if (number < oddMin) {
                    oddMin = number;
                    isOddMin = true;
                }

                if (number > oddMax) {
                    oddMax = number;
                    isOddMax = true;

                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (isOddMin){
            System.out.printf("OddMin=%.2f,%n", oddMin);
        }else{
            System.out.println("OddMin=No,");
        }
        if (isOddMax) {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }else {
            System.out.println("OddMax=No,");
        }

        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (isEvenMin){
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        }else{
            System.out.println("EvenMin=No,");
        }
        if (isEvenMax) {
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }else {
            System.out.println("EvenMax=No");
        }
    }
}
