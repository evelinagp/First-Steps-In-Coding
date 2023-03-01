package com.Exam;

import java.util.Scanner;

public class PuppyCare {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int purchasedQuantityOfFoodKg = Integer.parseInt(scanner.nextLine());
        int purchasedQuantityOfFoodGr = purchasedQuantityOfFoodKg * 1000;


        String input = scanner.nextLine();

        while (!input.equals("Adopted")) {
            int quantityFoodPerMealGr = Integer.parseInt(input);
            purchasedQuantityOfFoodGr -= quantityFoodPerMealGr;

            input = scanner.nextLine();
        }
        if (purchasedQuantityOfFoodGr >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", purchasedQuantityOfFoodGr);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(purchasedQuantityOfFoodGr));
        }
    }
}

