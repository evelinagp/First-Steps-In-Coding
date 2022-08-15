package com.FinalExam;

import java.util.Scanner;

public class ExcursionCalculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNumber = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double excursionTotalPrice = 0;

        if (season.equals("spring")) {

            if (peopleNumber <= 5) {
                excursionTotalPrice += peopleNumber * 50;
            } else if (peopleNumber > 5) {
                excursionTotalPrice += peopleNumber * 48;
            }
        } else if (season.equals("summer")) {

            if (peopleNumber <= 5) {
                excursionTotalPrice += (peopleNumber * 48.50) * 0.85;
            } else if (peopleNumber > 5) {
                excursionTotalPrice += (peopleNumber * 45) * 0.85;
            }
        } else if (season.equals("autumn")) {

            if (peopleNumber <= 5) {
                excursionTotalPrice += peopleNumber * 60.00;
            } else if (peopleNumber > 5) {
                excursionTotalPrice += peopleNumber * 49.50;
            }
        } else if (season.equals("winter")) {

            if (peopleNumber <= 5) {
                excursionTotalPrice += (peopleNumber * 86.00) * 1.08;
            } else if (peopleNumber > 5) {
                excursionTotalPrice += (peopleNumber * 85.00) * 1.08;
            }

//
        }
        System.out.printf("%.2f leva.", excursionTotalPrice);
    }
}
