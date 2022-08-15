package com.PBExams;

import java.util.Scanner;

public class EasterBake21And22April2019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int EasterBread = Integer.parseInt(scanner.nextLine());

        int sugar = 0;
        int flour = 0;

        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;


        while (EasterBread > 0) {
            int sugarSpent = Integer.parseInt(scanner.nextLine());
            int flourSpent = Integer.parseInt(scanner.nextLine());
            sugar += sugarSpent;
            flour += flourSpent;
            EasterBread--;
            if (sugarSpent > maxSugar) {
                maxSugar = sugarSpent;
            }
            if (flourSpent > maxFlour) {
                maxFlour = flourSpent;
            }
        }
        System.out.printf("Sugar: %.0f%n", Math.ceil(1.0 * sugar / 950));
        System.out.printf("Flour: %.0f%n", Math.ceil(1.0 * flour / 750));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
