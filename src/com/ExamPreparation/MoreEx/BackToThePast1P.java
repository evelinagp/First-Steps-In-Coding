package com.ExamPreparation;

import java.util.Scanner;

public class BackToThePast1P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int yearHaveToLive = Integer.parseInt(scanner.nextLine());
        int years = 17;

        for (int i = 1800; i <= yearHaveToLive; i++) {
            if (i % 2 == 0) {
                years += 1;
                inheritedMoney -= 12000;
            } else {
                years += 1;
                inheritedMoney -= 12000 + (50 * years);
            }
        }
        if (inheritedMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritedMoney));

        }
    }
}
