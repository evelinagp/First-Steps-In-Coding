package com.Excercise2.Ex;

import java.util.Scanner;

public class GodzillaVsKongEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double ClothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;

        if (people > 150){
            ClothesPrice  = ClothesPrice * 0.90;
        }
        double totalExpenses = decorPrice + ClothesPrice * people;

            String output = " ";
        if (budget >= totalExpenses){

   System.out.printf("Action!%n" + "Wingard starts filming with %.2f leva left.", budget - totalExpenses);

        }else {
       System.out.printf ( "Not enough money!%n" + "Wingard needs %.2f leva more.", totalExpenses - budget);

    }
}
}
