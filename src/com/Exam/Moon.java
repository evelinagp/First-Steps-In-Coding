package com.Exam;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double avrSpeed = Double.parseDouble(scanner.nextLine());
        double fuelPer100km = Double.parseDouble(scanner.nextLine());
        int distance = 384400;
        int totalDistance = distance * 2;
        double totalDistanceTime = Math.ceil(totalDistance/avrSpeed);
        double totalTime = totalDistanceTime + 3;

        double totalFuel = (fuelPer100km * totalDistance)/100;

        System.out.printf("%.0f%n",totalTime);
        System.out.printf("%.0f",totalFuel);

    }
}
