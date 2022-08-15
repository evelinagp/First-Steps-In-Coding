package com.PBExams;

import java.util.Scanner;

public class BasketballTournament9And10March2019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double matchesWin = 0;
        double matchesLost = 0;
        double totalMatches = 0;

        while (!input.equals("End of tournaments")) {
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= n; i++) {
                int pointsTeam1 = Integer.parseInt(scanner.nextLine());
                int pointsTeam2 = Integer.parseInt(scanner.nextLine());
                if (pointsTeam1 > pointsTeam2) {
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, input, pointsTeam1 - pointsTeam2);
                    matchesWin++;
                } else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, input, Math.abs(pointsTeam1 - pointsTeam2));
                    matchesLost++;
                }
                    totalMatches++;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", matchesWin / totalMatches * 100);
        System.out.printf("%.2f%% matches lost", matchesLost / totalMatches * 100);
    }
}
