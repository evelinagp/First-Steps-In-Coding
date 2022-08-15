package com.FinalExam;

import java.util.Scanner;

public class FootballKit2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double shirtPrice = Double.parseDouble(scanner.nextLine());
        double amount = Double.parseDouble(scanner.nextLine());

        double shortsPrice = shirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.2;
        double shoesPrice = (shirtPrice + shortsPrice) * 2;

        double totalAmount = (shirtPrice + shortsPrice + socksPrice + shoesPrice) * 0.85;

        if (totalAmount >= amount) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", totalAmount);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", amount - totalAmount);

        }
    }
}
