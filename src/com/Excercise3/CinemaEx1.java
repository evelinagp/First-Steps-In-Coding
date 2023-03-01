package com.Excercise3;

import java.util.Scanner;

public class CinemaEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        if ("Premiere".equals(projection)) {
            double income = 12.00 * rows * columns;
            System.out.printf("%.2f leva", income);

        } else if ("Normal".equals(projection)) {
            double income = 7.50 * rows * columns;
            System.out.printf("%.2f leva", income);

        } else if ("Discount".equals(projection)) {
            double income = 5.00 * rows * columns;
            System.out.printf("%.2f leva", income);

        }

    }
}
