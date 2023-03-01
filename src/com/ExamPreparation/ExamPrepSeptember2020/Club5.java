package com.ExamPreparation.ExamPrepSeptember2020;

import java.util.Scanner;

public class Club5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double desiredProfit = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        double totalIncome = 0;
        boolean isDesiredProfitAchieved = false;
        while (!input.equals("Party!")) {
            int cocktailsNumber = Integer.parseInt(scanner.nextLine());
            double cocktailPrice = input.length();
            double orderPrice = cocktailPrice * cocktailsNumber;

            if (orderPrice % 2 != 0) {
                orderPrice *= 0.75;
            }
            totalIncome += orderPrice;
            if (desiredProfit <= totalIncome) {
                isDesiredProfitAchieved = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isDesiredProfitAchieved) {
            System.out.println("Target acquired.");
        } else {
            System.out.printf("We need %.2f leva more.%n", desiredProfit - totalIncome);
        }
        System.out.printf("Club income - %.2f leva.", totalIncome);
    }
}
