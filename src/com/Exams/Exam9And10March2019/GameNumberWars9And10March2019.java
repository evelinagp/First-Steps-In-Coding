package PBExams;

import java.util.Scanner;

public class GameNumberWars9And10March2019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        String input = scanner.nextLine();

        int points1 = 0;
        int points2 = 0;
        String winner = "";
        while (!input.equals("End of game")) {
            int card1 = Integer.parseInt(input);
            int card2 = Integer.parseInt(scanner.nextLine());
            if (card1 > card2) {
                points1 += card1 - card2;
            } else if (card2 > card1) {
                points2 += card2 - card1;
            } else {
                card1 = Integer.parseInt(scanner.nextLine());
                card2 = Integer.parseInt(scanner.nextLine());
                if (card1 > card2) {
                    winner = name1;
                } else if (card2 > card1) {
                    winner = name2;
                }
                System.out.println("Number wars!");
                if (points1 > points2) {
                    System.out.printf("%s is winner with %d points", winner, points1);
                } else {
                    System.out.printf("%s is winner with %d points", winner, points2);
                }
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%s has %d points%n", name1, points1);
        System.out.printf("%s has %d points", name2, points2);

    }
}
