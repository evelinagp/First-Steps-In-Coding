package com.Excercise5;

import java.util.Scanner;

public class SuitcasesEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        int suitcasesCount = 0;
        int suitcasesSuccess = 0;

        String line = scanner.nextLine();
        boolean isFinished = false;
        while (!line.equals("End")) {
            double suitcaseVolume = Double.parseDouble(line);
            suitcasesCount++;
            if (suitcasesCount % 3 == 0) {
                suitcaseVolume *= 1.10;
            }
            capacity -= suitcaseVolume;
            if (capacity <= 0) {
                isFinished = true;
                break;
            }
            suitcasesSuccess++;
            line = scanner.nextLine();
        }
        if (isFinished) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", suitcasesSuccess);
    }
}


