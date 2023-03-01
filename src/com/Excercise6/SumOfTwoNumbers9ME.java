package com.Excercise6;

import java.util.Scanner;

public class SumOfTwoNumbers9P {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isMagic = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    isMagic = true;
                    break;
                }
            }
            if (isMagic) {
                break;
            }
        }
        if (!isMagic) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
