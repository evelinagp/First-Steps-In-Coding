package com.ExamPreparation.ExamPrepSeptember2020;

import java.util.Scanner;

public class EasterCompetition6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sweetBread = Integer.parseInt(scanner.nextLine());
        int maxPoints = 0;
        String bakerWithMaxPoints = "";

        for (int i = 0; i < sweetBread; i++) {
            int currentPoints = 0;
            String bakerName = scanner.nextLine();
            String input = scanner.nextLine();
            while (!"Stop".equals(input)) {
                int points = Integer.parseInt(input);
                currentPoints += points;
                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", bakerName, currentPoints);

            if (currentPoints > maxPoints) {
                maxPoints = currentPoints;
                bakerWithMaxPoints = bakerName;
                System.out.printf("%s is the new number 1!%n", bakerWithMaxPoints);
            }
        }
        System.out.printf("%s won competition with %d points!", bakerWithMaxPoints, maxPoints);
    }
}
