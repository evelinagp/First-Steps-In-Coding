package com.Excercise6;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            int freeSpaces = Integer.parseInt(scanner.nextLine());
            int currentMoviePeople = 0;

            for (int i = 0; i < freeSpaces; i++) {

                String ticketType = scanner.nextLine();
                if (ticketType.equals("standard")) {
                    standardTickets++;
                } else if (ticketType.equals("student")) {
                    studentTickets++;
                } else if (ticketType.equals("kid")) {
                    kidTickets++;
                } else if (ticketType.equals("End")) {
                    break;
                }
            currentMoviePeople++;
            }
            double percentage = 1.0 * currentMoviePeople/ freeSpaces * 100;
            System.out.printf("%s - %.2f%% full.%n", input, percentage);
            input = scanner.nextLine();
        }
        int totalTickets = standardTickets + studentTickets + kidTickets;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * studentTickets / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * standardTickets / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", 1.0 * kidTickets / totalTickets * 100);
    }
}

