package com.Exsercise4;

import java.util.Scanner;

public class CleverLilyLab11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double priceWM = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysCount = 0;
        double money = 10;
        double sum = 0.0;

        for (int i = 1; i <= years; i++) {
//            even year
            if (i % 2 == 0) {
                sum += money;
                sum -= 1;
                money += 10;

//                odd year

            } else {
                toysCount++;
            }
        }
//        toy sell
        sum += toyPrice * toysCount;
        if (priceWM <= sum) {
            System.out.printf("Yes! %.2f", sum - priceWM);
        } else {
            System.out.printf("No! %.2f", priceWM - sum);

        }
    }
}
