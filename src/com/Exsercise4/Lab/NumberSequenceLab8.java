package com.Exsercise4.Lab;

import java.util.Scanner;

public class NumberSequenceLab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
//            check for max number
            if (number > maxNumber) {
                maxNumber = number;
                //check for min number
            }
            if (number < minNumber) {
                minNumber = number;

            }
        }
        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
