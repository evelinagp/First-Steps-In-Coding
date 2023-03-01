package PBExams;

import java.util.Scanner;

public class TennisRanklist9And10March2019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

//        int W = 2000;
//        int F = 1200;
//        int SF = 720;
        int winner = 0;
        int earnedPoints = 0;
        for (int i = 1; i <= tournaments; i++) {
            String text = scanner.nextLine();
            if (text.equals("W")) {
                earnedPoints += 2000;
                winner++;
            } else if (text.equals("F")) {
                earnedPoints += 1200;
            } else if (text.equals("SF")) {
                earnedPoints += 720;
            }
        }
        System.out.printf("Final points: %d%n", initialPoints + earnedPoints);
        System.out.printf("Average points: %d%n", earnedPoints / tournaments);
        System.out.printf("%.2f%%", 1.0 * winner / tournaments * 100);
    }
}
