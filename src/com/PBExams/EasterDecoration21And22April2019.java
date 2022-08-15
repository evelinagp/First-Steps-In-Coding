package com.PBExams;

import java.util.Scanner;

public class EasterDecoration21And22April2019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;
        for (int i = 1; i <= clients; i++) {
            String input = scanner.nextLine();
            int counter = 0;
            double sum = 0;
            while (!input.equals("Finish")) {
                counter++;
                if (input.equals("basket")) {
                    sum += 1.50;
                } else if (input.equals("wreath")) {
                    sum += 3.80;
                } else if (input.equals("chocolate bunny")) {
                    sum += 7;
                }
                input = scanner.nextLine();
            }
            if (counter % 2 == 0) {
                sum *= 0.80;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", counter, sum);
            totalSum += sum;
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalSum / clients);
    }
}

