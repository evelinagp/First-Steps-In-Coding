package com.Exam;

import java.util.Scanner;

public class Moon2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int avrSpeed = Integer.parseInt(scanner.nextLine());
        int fuelPer100km = Integer.parseInt(scanner.nextLine());
        int distance = 384400;
        int totalDistance = distance * 2;
        int totalDistanceTime = (totalDistance / avrSpeed);
        double totalTime = totalDistanceTime + 3;

        int totalFuel = (fuelPer100km * totalDistance) / 100;

        System.out.println(totalTime);
        System.out.println(totalFuel);

    }
}


