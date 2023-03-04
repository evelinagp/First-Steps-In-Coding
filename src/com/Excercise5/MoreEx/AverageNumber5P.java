package com.Excercise5.MoreEx;

import java.util.Scanner;

public class AverageNumber5P {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        double sum = 0;
        double count = 0;

        while (i <= n) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
            i++;
            count++;
        }
        System.out.printf("%.2f", sum / count);
    }
}


