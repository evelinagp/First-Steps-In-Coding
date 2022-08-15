package com.PBExams;

import java.util.Scanner;

public class NameGame6And7July2019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();

        int maxScore = 0;
        String winnerName = "";
        while (!name.equals("Stop")) {
            int currentScore = 0;
            for (int i = 0; i < name.length(); i++) {
               int charLetter = name.charAt(i);

                int n = Integer.parseInt(scanner.nextLine()); // тук четем число, а не в самото начало, за да отговаря на всяка буква!
                if (charLetter == n) {
                    currentScore = currentScore + 10;
                } else {
                    currentScore = currentScore + 2;
                }

                if (currentScore >= maxScore) // >= брез равно дава 90/100
                {
                    maxScore = currentScore;
                    winnerName= name;
                }
            }
            name = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winnerName,maxScore);
    }
}