package com;

import java.util.Scanner;

public class ShopLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int toysCount = puzzles + dolls + bears + minions + trucks;
        double price = puzzles * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.2 + trucks * 2.0;

        if (toysCount >= 50) {
            price *= 0.75;
                    }
        price *= 0.90;
//        String output = " ";

        if (excursionPrice <= price)
        {
            System.out.printf("Yes! %.2f lv left.", price - excursionPrice);
        } else {
                System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - price);
            }

        }


    }


