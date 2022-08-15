package com.FinalExam;

import java.util.Scanner;

public class Excursion1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int cards = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());

//        •	Нощувка - 20 лв.
//•	Карта за транспорт - 1.60 лв.
//•	Билет за музей - 6 лв.
        int nightsPrice = nights * 20;
        double cardsPrice = cards * 1.6;
        int ticketsPrice = tickets * 6;

        double totalSum = people * (nightsPrice+cardsPrice+ticketsPrice)*1.25;
        System.out.printf("%.2f",totalSum );
    }
}
