package com.Excercise3.Ex;

import java.util.Scanner;

public class FishingBoatEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
//        •	Цената за наем на кораба през пролетта е  3000 лв.
//•	Цената за наем на кораба през лятото и есента е  4200 лв.
//•	Цената за наем на кораба през зимата е  2600 лв.      SEASON

        double rentBoat = 0.0;
        switch (season) {
            case "Spring":
                rentBoat = 3000;
                break;

            case "Summer":
                rentBoat = 4200;
                break;

            case "Autumn":
                rentBoat = 4200;
                break;

            case "Winter":
                rentBoat = 2600;
                break;
        }
        if (fishers <= 6) {
            rentBoat *= 0.90;
        } else if (fishers <= 11) {
            rentBoat *= 0.85;
        } else {
            rentBoat *= 0.75;
        }
        if (fishers % 2 == 0 && !season.equals("Autumn")) {
            rentBoat *= 0.95;
        }

        if (budget >= rentBoat) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rentBoat);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rentBoat - budget);
        }
    }
}




