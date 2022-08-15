package com.Excercise6;

import java.util.Scanner;

public class GoldMineExam25October2020 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int locationNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < locationNumber; i++) {

            double expectedAverageExtractionPerDay = Double.parseDouble(scanner.nextLine());
            int diggingDays = Integer.parseInt(scanner.nextLine());
            double sumExtractionPerDay = 0;
            for (int j = 0; j < diggingDays; j++) {
                double extractionPerDay = Double.parseDouble(scanner.nextLine());
                sumExtractionPerDay += extractionPerDay;
            }
            double averageExtraction = sumExtractionPerDay / diggingDays;
            if (averageExtraction >= expectedAverageExtractionPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.", averageExtraction);
            } else {
                System.out.printf("You need %.2f gold.", expectedAverageExtractionPerDay - averageExtraction);
                locationNumber = Integer.parseInt(scanner.nextLine());
            }
            System.out.println();
        }
    }
}
