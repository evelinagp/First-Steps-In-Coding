package com.Exam;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int hoursSpent = Integer.parseInt(scanner.nextLine());
        int peopleInGroup = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

//        •	На първия ред - месецът - текст с възможности: "march", "april", "may", "june", "july", "august"
//•	На втория ред - броят на прекараните часове - цяло число в диапазона [1...10]
//•	На третия ред - броят на хората в групата -  цяло число в диапазона [1...10]
//•	На четвъртия ред - времето от деня – текст с възможности: "day", "night"
        double pricePerHour = 0;
        if ("march".equals(month) || "april".equals(month) || "may".equals(month))
            if ("night".equals(dayTime)) {
                pricePerHour = 8.4;
            } else {
                pricePerHour = 10.50;
            }
        if ("june".equals(month) || "july".equals(month) || "august".equals(month))
            if ("night".equals(dayTime)) {
                pricePerHour = 10.20;
            } else {
                pricePerHour = 12.60;
            }
        if (peopleInGroup >= 4) {
            pricePerHour *= 0.90;
        }
        if (hoursSpent >= 5) {
            pricePerHour *= 0.50;
        }
        double totalCost = (pricePerHour * peopleInGroup) * hoursSpent  ;
        System.out.printf("Price per person for one hour: %.2f%n", pricePerHour);
        System.out.printf("Total cost of the visit: %.2f%n", totalCost);

    }
}


