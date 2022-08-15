package com.PBExams;

import java.util.Scanner;

public class TournamentOfChristmas28And29March2020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double totalMoney = 0;
        int win = 0;
        int lose = 0;
        for (int i = 1; i <= days; i++) {
            String input = scanner.nextLine();
            int winCurrent = 0;
            int loseCurrent = 0;
            int currentMoney = 0;
            while (!input.equals("Finish")) {
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    currentMoney += 20;
                    winCurrent++;
                    win++;
                } else {
                    currentMoney += 0;
                    loseCurrent++;
                    lose++;
                }
                input = scanner.nextLine();
                if (input.equals("Finish") && winCurrent > loseCurrent) {
                    currentMoney *= 1.10;
                }
            }
            totalMoney += currentMoney;
        }
        if (win > lose) {
            totalMoney *= 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
