package com.PBExams;

import java.util.Scanner;

public class TouristShop2And3May2019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();
        double totalPrice = 0;
        double counter = 0;
        boolean isFinished = false;
        while (!input.equals("Stop")) {
            double price = Double.parseDouble(scanner.nextLine());
            counter++;
            if (counter % 3 ==0) {
                totalPrice += 0.5 * price;
                budget -= 0.5 * price;
            } else {
                totalPrice += price;
                budget -= price;
            }
            if (budget < 0) {
                isFinished = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isFinished) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", Math.abs(budget));
        } else {
            System.out.printf("You bought %.0f products for %.2f leva.", counter, totalPrice);
        }
    }
}
