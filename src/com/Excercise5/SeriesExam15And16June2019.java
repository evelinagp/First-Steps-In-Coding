package com.Excercise5;

import java.util.Scanner;

public class SeriesExam15And16June2019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int serialsNumber = Integer.parseInt(scanner.nextLine());
        int i = 0;
        double totalPrice = 0;
        while (i < serialsNumber) {
            String currentSerial = scanner.nextLine();
            double serialPrice = Double.parseDouble(scanner.nextLine());
            i++;
            if (currentSerial.equals("Thrones")) {
                serialPrice *= 0.5;
            } else if (currentSerial.equals("Lucifer")) {
                serialPrice *= 0.6;
            } else if (currentSerial.equals("Protector")) {
                serialPrice *= 0.7;
            } else if (currentSerial.equals("TotalDrama")) {
                serialPrice *= 0.8;
            } else if (currentSerial.equals("Area")) {
                serialPrice *= 0.9;
            }
            totalPrice += serialPrice;
        }
        if (budget >= totalPrice) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - totalPrice);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", totalPrice - budget);
        }
    }
}
