package com.ExamPreparation;

import java.util.Scanner;

public class FootballLeague7P {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fansNumber = Integer.parseInt(scanner.nextLine());
        int fansA = 0;
        int fansB = 0;
        int fansV = 0;
        int fansG = 0;

        for (int i = 1; i <= fansNumber; i++) {
            String sector = scanner.nextLine();

            if (sector.equals("A")) {
                fansA++;
            } else if (sector.equals("B")) {
                fansB++;
            } else if (sector.equals("V")) {
                fansV++;
            } else if (sector.equals("G")) {
                fansG++;
            }
        }

        double percentageA = (fansA * 1.0 / fansNumber) * 100;
        double percentageB = (fansB * 1.0 / fansNumber) * 100;
        double percentageV = (fansV * 1.0 / fansNumber) * 100;
        double percentageG = (fansG * 1.0 / fansNumber) * 100;

        double percentageStadium = (fansNumber * 1.0 / stadiumCapacity) * 100;

        System.out.printf("%.2f%%%n", percentageA);
        System.out.printf("%.2f%%%n", percentageB);
        System.out.printf("%.2f%%%n", percentageV);
        System.out.printf("%.2f%%%n", percentageG);
        System.out.printf("%.2f%%%n", percentageStadium);
    }
}

