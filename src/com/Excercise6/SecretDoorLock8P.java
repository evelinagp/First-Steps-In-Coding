package com.Excercise6;

import java.util.Scanner;

public class SecretDoorLock8P {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int limitOfHundred = Integer.parseInt(scanner.nextLine());
        int limitOfTen = Integer.parseInt(scanner.nextLine());
        int limitOfOne = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= limitOfHundred; i++) {
            for (int j = 1; j <= limitOfTen; j++) {
                for (int k = 1; k <= limitOfOne; k++) {
                    if (i % 2 == 0 && k % 2 == 0)
                        if (j == 2 || j == 3 || j == 5 || j == 7) {
                            System.out.printf("%d %d %d%n", i, j, k);
                        }
                }
            }
        }
    }
}

