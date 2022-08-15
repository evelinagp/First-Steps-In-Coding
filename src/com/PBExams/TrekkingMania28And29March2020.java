package com.PBExams;

import java.util.Scanner;

public class TrekkingMania28And29March2020 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int groupNumber = Integer.parseInt(scanner.nextLine());

        double musala = 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;
        double total = 0;

        for (int i = 1; i <= groupNumber; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            if (peopleInGroup <= 5) {
                musala += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblan += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimandjaro += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2 += peopleInGroup;
            } else {
                everest += peopleInGroup;
            }
            total += peopleInGroup;
        }
        System.out.printf("%.2f%%%n", musala / total * 100);
        System.out.printf("%.2f%%%n", monblan / total * 100);
        System.out.printf("%.2f%%%n", kilimandjaro / total * 100);
        System.out.printf("%.2f%%%n", k2 / total * 100);
        System.out.printf("%.2f%%", everest / total * 100);
    }
}
