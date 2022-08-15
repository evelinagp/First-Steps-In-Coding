package com.Excercise5;

import java.util.Scanner;

public class PCGameShop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int nSoldGames = Integer.parseInt(scanner.nextLine());
        double countHearthstone = 0;
        double countFornite = 0;
        double countOverwatch = 0;
        double countOthers = 0;

        for (int i = 0; i < nSoldGames; i++) {
            String currentSoldGame = scanner.nextLine();

            if (currentSoldGame.equals("Hearthstone")) {
                countHearthstone++;

            } else if (currentSoldGame.equals("Fornite")) {
                countFornite++;
                            } else if (currentSoldGame.equals("Overwatch")) {
                countOverwatch++;
            } else {
                countOthers++;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", countHearthstone / nSoldGames * 100);
        System.out.printf("Fornite - %.2f%%%n", countFornite / nSoldGames * 100);
        System.out.printf("Overwatch - %.2f%%%n", countOverwatch / nSoldGames * 100);
        System.out.printf("Others - %.2f%%%n", countOthers / nSoldGames * 100);
    }
}






