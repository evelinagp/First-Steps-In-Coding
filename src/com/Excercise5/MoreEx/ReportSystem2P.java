package com.Excercise5;

import java.util.Scanner;

public class ReportSystem2P {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int neededSum = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;
        int counter = 1;
        int currentSumCash = 0;
        int currentSumCard = 0;

        int cardCount = 0;
        int cashCount = 0;

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            int productPrice = Integer.parseInt(line);
            if (counter % 2 == 0) {
                if (productPrice < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    currentSumCard += productPrice;
                    totalSum += productPrice;
                    cardCount++;
                }
            } else {
                if (productPrice > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    currentSumCash += productPrice;
                    totalSum += productPrice;
                    cashCount++;
                }
            }
            if (totalSum >= neededSum) {
                break;
            }
            counter++;
            line = scanner.nextLine();
        }
        if (totalSum >= neededSum) {
            double averageCash = 1.0 * currentSumCash / cashCount;
            double averageCard = 1.0 * currentSumCard / cardCount;
            System.out.printf("Average CS: %.2f%n", averageCash);
            System.out.printf("Average CC: %.2f", averageCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}

