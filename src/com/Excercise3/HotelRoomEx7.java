package com.Excercise3;

import java.util.Scanner;

public class HotelRoomEx7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        double nights = Double.parseDouble(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;


        if (month.equals("May") || month.equals("October")) {
            priceStudio = 50;
            priceApartment = 65;
            if (nights > 7 && nights <= 14) {
                priceStudio *= 0.95;

            } else if (nights > 14) {
                priceStudio *= 0.70;
                priceApartment *= 0.90;
            }

        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.2;
            priceApartment = 68.70;
            if (nights > 14) {
                priceStudio *= 0.80;
                priceApartment *= 0.90;
            }

        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = 76;
            priceApartment = 77;
            if (nights > 14) {
                priceApartment *= 0.90;

            }
        }
        double totalPriceStudio = priceStudio * nights;
        double totalPriceApartment = priceApartment * nights;

        System.out.printf("Apartment: %.2f lv.%n", totalPriceApartment);
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);
    }
}
