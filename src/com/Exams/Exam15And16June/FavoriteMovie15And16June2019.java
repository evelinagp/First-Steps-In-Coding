package PBExams;

import java.util.Scanner;

public class FavoriteMovie15And16June2019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String bestMovie = "";
        int counter = 0;
        int maxScore = Integer.MIN_VALUE;

        while (!input.equals("STOP")) {
            counter++;
            int currentScore = 0;
            int length = input.length();
            for (int i = 0; i < length; i++) {
                int symbol = input.charAt(i);
                currentScore += symbol;
                if (symbol >= 65 && symbol <= 90) {
                    currentScore -= length;
                } else if (symbol >= 97 && symbol <= 122) {
                    currentScore -= 2 * length;
                }
                if (currentScore > maxScore) {
                    maxScore = currentScore;
                    bestMovie = input;
                }
                if (counter == 7) {
                    System.out.println("The limit is reached.");
                    System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxScore);
                    return;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, maxScore);
    }
}



