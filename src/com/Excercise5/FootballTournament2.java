package com.Excercise5;

import java.util.Scanner;

public class FootballTournament2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();

        int matchesCount = Integer.parseInt(scanner.nextLine());


        int totalCount = 0;
        int sumPoints = 0;
        int wCount = 0;
        int dCount = 0;
        int lCount = 0;


        while (totalCount < matchesCount) {
            String symbol = scanner.nextLine();
            totalCount++;
            if (symbol.equals("W")) {
                sumPoints += 3;
                wCount++;
            } else if ((symbol.equals("D"))) {
                sumPoints += 1;
                dCount++;
            } else if ((symbol.equals("L"))) {
                sumPoints += 0;
                lCount++;
            }
        }
        if (matchesCount == 0) {
            System.out.printf("%s hasn't played any games during this season.", teamName);
        } else {
            System.out.printf("%s has won %d points during this season.%n", teamName, sumPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", wCount);
            System.out.printf("## D: %d%n", dCount);
            System.out.printf("## L: %d%n", lCount);
            System.out.printf("Win rate: %.2f%%", 1.0 * wCount / totalCount * 100);
        }
    }
}


