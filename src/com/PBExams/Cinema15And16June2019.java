package com.PBExams;

import java.util.Scanner;

public class Cinema15And16June2019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
//        int ticketPrice = 5;
        int profit = 0;
        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);
            capacity -= people;
            if (capacity < 0) {
                System.out.println("The cinema is full.");
                System.out.printf("Cinema income - %d lv.",profit);
                return;
            }
            if (people % 3 == 0) {
                profit += (people * 5) - 5;
            } else {
                profit += (people * 5);
            }
            input = scanner.nextLine();
        }
        System.out.printf("There are %d seats left in the cinema.%n", capacity);
        System.out.printf("Cinema income - %d lv.",profit);
    }
}

