package com.Excercise3.Ex;

import java.util.Scanner;

public class NewHouseEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double expenses = 0;

        switch (flowers) {
            case "Roses":
                expenses = numFlowers * 5;
                if (numFlowers > 80) {
                    expenses *= 0.9;
                }
                break;
            case "Dahlias":
                expenses = numFlowers * 3.80;
                if (numFlowers > 90) {
                    expenses *= 0.85;
                }
                break;
            case "Tulips":
                expenses = numFlowers * 2.8;
                if (numFlowers > 80) {
                    expenses *= 0.85;
                }
                break;
            case "Narcissus":
                expenses = numFlowers * 3.0;
                if (numFlowers < 120) {
                    expenses *= 1.15;
                }
                break;
            case "Gladiolus":
                expenses = numFlowers * 2.5;
                if (numFlowers < 80) {
                    expenses *= 1.20;
                }
                break;
        }

        if (budget >= expenses) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flowers, budget - expenses);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", expenses - budget);
        }
    }
}







