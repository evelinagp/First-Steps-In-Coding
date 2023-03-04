package com.Excercise6.Lab;

import java.util.Scanner;

public class CinemaTicketsLab7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        while (!"Finish".equals(movieName)) {
            int freeSpaceInCinema = Integer.parseInt(scanner.nextLine());
            int currentMoviePeople = 0;
            for (int i = 0; i < freeSpaceInCinema; i++) {
                String ticketType = scanner.nextLine();
//          student, standard, kids
                if ("student".equals(ticketType)) {
                    studentTickets++;
                } else if ("standard".equals(ticketType)) {
                    standardTickets++;
                } else if ("kid".equals(ticketType)) {
                    kidTickets++;
                } else if ("End".equals(ticketType)) {
                    break;
                }
                currentMoviePeople++;
            }
            double percentage = 1.0 * currentMoviePeople / freeSpaceInCinema * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentage);
            movieName = scanner.nextLine();
        }
        int totalTickets  = standardTickets + studentTickets + kidTickets;

        System.out.printf("Total tickets: %d%n", totalTickets);

        System.out.printf("%.2f%% student tickets.%n", 1.0 * studentTickets/totalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * standardTickets/totalTickets*100);
        System.out.printf("%.2f%% kids tickets.%n", 1.0 * kidTickets/totalTickets*100);
    }
}
