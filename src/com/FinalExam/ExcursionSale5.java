package com.FinalExam;

import java.util.Scanner;

public class ExcursionSale5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaNumber = Integer.parseInt(scanner.nextLine());
        int mountainNumber = Integer.parseInt(scanner.nextLine());

        int seaPrice = 680;
        int mountainPrice = 499;

        int profitSum = 0;
        boolean isMontain = false;
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {

            if (input.equals("mountain")) {
                profitSum += mountainPrice;
                isMontain = true;
            } else if (input.equals("sea")) {
                profitSum += seaPrice;
            }
            if (seaNumber == 0 && mountainNumber == 0) {
                break;
            }
            if (isMontain) {
                mountainNumber--;
            } else {
                seaNumber--;
            }
            input = scanner.nextLine();
        }

        if (seaNumber == 0 && mountainNumber == 0) {

            System.out.printf("Good job! Everything is sold.%n" +
                    "Profit: %d leva.", profitSum);
        } else {
            System.out.printf("Profit: %d leva.", profitSum);
        }
    }
}
