package com.Excercise5;

import java.util.Scanner;

public class PCGameShop6And7July19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nSoldGames = Integer.parseInt(scanner.nextLine());

        double countHearthstone = 0;
        double countFornite = 0;
        double countOverwatch = 0;
        double countOthers = 0;
        int i = 0;

        while (i < nSoldGames) {
        String nameOfTheGame = scanner.nextLine();
            i++;
            if ("Hearthstone".equals(nameOfTheGame)) {
                countHearthstone++;
            } else if ("Fornite".equals(nameOfTheGame)) {
                countFornite++;
            } else if ("Overwatch".equals(nameOfTheGame)) {
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
