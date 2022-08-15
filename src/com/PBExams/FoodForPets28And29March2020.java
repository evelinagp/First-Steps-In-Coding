package com.PBExams;

import java.util.Scanner;

public class FoodForPets28And29March2020 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int daysNumber = Integer.parseInt(scanner.nextLine());
        double totalFoodGr = Double.parseDouble(scanner.nextLine());

        int foodDogTotal = 0;
        int foodCatTotal = 0;
        double biscuitsTotal = 0;
        for (int i = 1; i <= daysNumber; i++) {
            int foodDog = Integer.parseInt(scanner.nextLine());
            int foodCat = Integer.parseInt(scanner.nextLine());
            foodDogTotal += foodDog;
            foodCatTotal += foodCat;
            if (i % 3 == 0) {
                biscuitsTotal += (foodCat + foodDog) * 0.1;
            }
//            if ((foodCatTotal + foodDogTotal) > totalFoodGr) {
//                break;
//            }
        }
        int catDogTotal = foodDogTotal + foodCatTotal;
        System.out.printf("Total eaten biscuits: %dgr.%n",  Math.round(biscuitsTotal));
        System.out.printf("%.2f%% of the food has been eaten.%n", catDogTotal / totalFoodGr * 100);
        System.out.printf("%.2f%% eaten from the dog.%n",  (1.0 *foodDogTotal / catDogTotal) * 100);
        System.out.printf("%.2f%% eaten from the cat.",  (1.0 *foodCatTotal / catDogTotal) * 100);
    }
}
