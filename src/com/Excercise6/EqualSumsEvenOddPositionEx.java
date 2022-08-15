package com.Excercise6;

import java.util.Scanner;

public class EqualSumsEvenOddPositionEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            int number = i;
            int OddSum = 0;
            int EvenSum = 0;

            for (int j = 6; j >= 1; j--) {

                int digit = number % 10;
                number = number / 10;

                if (j % 2 == 0) {
                    EvenSum += digit;
                } else {
                    OddSum += digit;
                }
            }
            if (OddSum == EvenSum) {
                System.out.print(i + " ");
            }
        }
    }
}
