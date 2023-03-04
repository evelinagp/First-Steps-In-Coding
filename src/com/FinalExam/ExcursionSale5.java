package com.FinalExam;

import java.util.Scanner;

public class ExcursionSale5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaNumber = Integer.parseInt(scanner.nextLine());
        int mountainNumber = Integer.parseInt(scanner.nextLine());

        int price = 0;
        int profitSum = 0;

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            if (input.equals("sea")) {
                if (seaNumber > 0) {
                    price = 680;
                    profitSum += price;
                    seaNumber--;
                } else {
                    price += 0;
                }
            } else if (input.equals("mountain")) {
                if (mountainNumber > 0) {
                    price = 499;
                    profitSum += price;
                    mountainNumber--;
                } else {
                    price += 0;
                }
            }
            if (seaNumber == 0 && mountainNumber == 0) {
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Stop")) {
            System.out.printf("Profit: %d leva.", profitSum);
        } else {
            System.out.println("Good job! Everything is sold.");
            System.out.printf("Profit: %d leva.", profitSum);
        }
    }
}

