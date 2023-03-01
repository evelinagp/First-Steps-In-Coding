package com.Exam;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLocations = Integer.parseInt(scanner.nextLine());


        double yieldPerLocationForAllDays = 0;
        for (int i = 0; i < numberOfLocations; i++) {
            double expectedAvgYieldGoldPerLocationForAllDays = Double.parseDouble(scanner.nextLine());
            int numberOfDaysPerLocation = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < numberOfDaysPerLocation; j++) {
                int yieldPerDay = Integer.parseInt(scanner.nextLine());
                yieldPerLocationForAllDays += yieldPerDay;
            }
            double avgYieldPerLocationForAllDays = yieldPerLocationForAllDays / numberOfDaysPerLocation;
            if (avgYieldPerLocationForAllDays >= expectedAvgYieldGoldPerLocationForAllDays) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", avgYieldPerLocationForAllDays);
            } else {
                System.out.printf("You need %.2f gold.", expectedAvgYieldGoldPerLocationForAllDays - avgYieldPerLocationForAllDays);
            }
            yieldPerLocationForAllDays = 0;
        }
    }
}
