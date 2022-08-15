package com.ExamPreparation;

import java.util.Scanner;

public class TouristAgency3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1.	Име на града - текст с възможности ("Bansko",  "Borovets", "Varna" или "Burgas")
        String cityName = scanner.nextLine();

//2.	Вид на пакета - текст с възможности ("noEquipment",  "withEquipment", "noBreakfast" или "withBreakfast")
        String pack = scanner.nextLine();
//3.	Притежание на VIP отстъпка - текст с възможности  "yes" или "no"
        String hasVIP = scanner.nextLine();
//4.	Дни за престой - цяло число в интервала [1 … 10000]
        int days = Integer.parseInt(scanner.nextLine());
        double singlePrice = 0.0;
        double percentageDiscount = 0.0;

        boolean isInvalid = false;
        switch (cityName) {
            case "Bansko":
            case "Borovets":
                if ("noEquipment".equals(pack)) {
                    singlePrice = 80;
                    percentageDiscount = 0.95;
                } else if ("withEquipment".equals(pack)) {
                    singlePrice = 100;
                    percentageDiscount = 0.90;
                } else {
                    isInvalid = true;
                }
                break;
            case "Varna":
            case "Burgas":
                if ("noBreakfast".equals(pack)) {
                    singlePrice = 100;
                    percentageDiscount = 0.93;
                } else if ("withBreakfast".equals(pack)) {
                    singlePrice = 130;
                    percentageDiscount = 0.88;
                } else {
                    isInvalid = true;
                }
                break;
        }
        if (days > 7) {
            days--;
        }
        if ("yes".equals(hasVIP)) {
            singlePrice = singlePrice * percentageDiscount;
        }
        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else if (isInvalid) {
            System.out.println("Invalid input!");
        } else {
            double finalPrice = singlePrice * days;
            System.out.printf("The price is %.2flv! Have a nice time!", finalPrice);
        }
    }
}
