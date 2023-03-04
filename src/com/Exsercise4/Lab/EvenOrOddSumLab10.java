package com.Exsercise4.Lab;

import java.util.Scanner;

public class EvenOrOddSumLab10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oddCountSum = 0;
        int evenCountSum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
               if (i % 2 == 0) {
                evenCountSum += number;

            }else {
                oddCountSum += number;
            }
        }
        if (oddCountSum == evenCountSum) {
            System.out.println("Yes");
            System.out.printf("Sum = " + oddCountSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = " + Math.abs(oddCountSum - evenCountSum));

        }
    }
}

