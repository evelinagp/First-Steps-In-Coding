package com.PBExams;

import java.util.Scanner;

public class MovieStars15And16June2019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        while (!name.equals("ACTION")) {
            int length = name.length();
            if (length <= 15 && length > 0) {
                double remuneration = Double.parseDouble(scanner.nextLine());
                budget -= remuneration;
            } else {
                budget -= budget * 0.2;
            }
            if (budget <= 0) {
                break;
            }
            name = scanner.nextLine();
        }
        if (budget > 0) {
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }
    }
}
