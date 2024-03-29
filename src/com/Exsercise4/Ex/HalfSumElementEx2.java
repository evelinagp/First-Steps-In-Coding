package com.Exsercise4.Ex;

import java.util.Scanner;

public class HalfSumElementEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;

            if (number > max) {
                max = number;
            }
        }
        int sumWithOutMaxNumber = sum - max;

        if (sumWithOutMaxNumber == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            int diff = Math.abs(max - sumWithOutMaxNumber);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }

    }
}

