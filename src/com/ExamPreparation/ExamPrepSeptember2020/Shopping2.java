package com.ExamPreparation.ExamPrepSeptember2020;

import java.util.Scanner;

public class Shopping2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1.	Бюджетът на Петър - реално число в интервала [0.0…100000.0]
//2.	Броят видеокарти - цяло число в интервала [0…100]
//3.	Броят процесори - цяло число в интервала [0…100]
//4.	Броят рам памет - цяло число в интервала [0…100]

        double peterBudget = Double.parseDouble(scanner.nextLine());
        int videoCardCount = Integer.parseInt(scanner.nextLine());
        int processorCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

//        •	Видеокарта – 250 лв./бр.
        int videoCardsTotalPrice = videoCardCount * 250;
//•	Процесор – 35% от цената на закупените видеокарти/бр.
        double processorPrice = videoCardsTotalPrice * 0.35;
        double processorTotalPrice = processorPrice * processorCount;
//•	Рам памет – 10% от цената на закупените видеокарти/бр.
        double ramPrice = videoCardsTotalPrice * 0.10;
        double ramTotalPrice = ramCount * ramPrice;

        double totalPrice = videoCardsTotalPrice + ramTotalPrice + processorTotalPrice;
        if (videoCardCount > processorCount) {
            totalPrice = totalPrice * 0.85;
        }
        if (peterBudget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", peterBudget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - peterBudget);
        }

    }
}
