package PBExams;

import java.util.Scanner;

public class Darts9And10March2019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();

        double totalPoints = 301;
        double successfulShots = 0;
        double unsuccessfulShots = 0;
        String input = scanner.nextLine();

        while (!input.equals("Retire")) {
            int currentPoints = Integer.parseInt(scanner.nextLine());
            if (input.equals("Single")) {
                totalPoints -= currentPoints;
                if (totalPoints >= 0) {
                    successfulShots++;
                } else {
                    unsuccessfulShots++;
                    totalPoints += currentPoints;
                }
            } else if (input.equals("Double")) {
                totalPoints -= 2 * currentPoints;
                if (totalPoints >= 0) {
                    successfulShots++;
                } else {
                    unsuccessfulShots++;
                    totalPoints += 2 * currentPoints;
                }
            } else if (input.equals("Triple")) {
                totalPoints -= 3 * currentPoints;
                if (totalPoints >= 0) {
                    successfulShots++;
                } else {
                    unsuccessfulShots++;
                    totalPoints += 3 * currentPoints;
                }
            }
            if (totalPoints == 0) {
                System.out.printf("%s won the leg with %.0f shots.", playerName, successfulShots);
                break;
            }
            input = scanner.nextLine();
        }
        if (totalPoints != 0) {
            System.out.printf("%s retired after %.0f unsuccessful shots.", playerName, unsuccessfulShots);
        }
    }
}


