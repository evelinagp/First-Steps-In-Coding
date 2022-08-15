package com.PBExams;

import java.util.Scanner;

public class EasterEggs21And22April2019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int paintedEggs = Integer.parseInt(scanner.nextLine());

        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;

        int maxNumber = Integer.MIN_VALUE;
        String eggColorMax = "";

        while (paintedEggs > 0) {
            String eggColor = scanner.nextLine();
            paintedEggs--;

            if (eggColor.equals("red")) {
                red++;
            } else if (eggColor.equals("orange")) {
                orange++;
            } else if (eggColor.equals("blue")) {
                blue++;
            } else if (eggColor.equals("green")) {
                green++;
            }
            if (red > maxNumber) {
                maxNumber = red;
                eggColorMax = "red";
            } else if (orange > maxNumber) {
                maxNumber = orange;
                eggColorMax = "orange";
            } else if (blue > maxNumber) {
                maxNumber = blue;
                eggColorMax = "blue";
            } else if (green > maxNumber) {
                maxNumber = green;
                eggColorMax = "green";
            }
        }
        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);
        System.out.printf("Max eggs: %d -> %s", maxNumber, eggColorMax);
    }
}
