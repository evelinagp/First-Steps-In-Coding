package com.Excercise6;

import java.util.Scanner;

public class TravellingLab5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            double minimalBudget = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;
            while (savedMoney < minimalBudget) {
                double money = Double.parseDouble(scanner.nextLine());
                savedMoney +=money;
            }
            System.out.printf("Going to %s!%n", input);
//            savedMoney = 0;
            input = scanner.nextLine();
        }
    }
}