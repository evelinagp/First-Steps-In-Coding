package com.Excercise6;

import java.util.Scanner;

public class PrimePairs13P {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startFirstCouple = Integer.parseInt(scanner.nextLine());
        int startSecondCouple = Integer.parseInt(scanner.nextLine());
        int stepFirstCouple = Integer.parseInt(scanner.nextLine());
        int stepSecondCouple = Integer.parseInt(scanner.nextLine());


        for (int i = startFirstCouple; i <= startFirstCouple + stepFirstCouple; i++) {
            for (int j = startSecondCouple; j <= startSecondCouple + stepSecondCouple; j++) {

                if (i == 11 || i == 13 || i == 17 || i == 19 || i == 23 || i == 29 || i == 31 || i == 37 || i == 41 || i == 43 || i == 47 || i == 53 || i == 59 || i == 61 || i == 67 || i == 71 || i == 73 || i == 79 || i == 83 || i == 89 || i == 97) {
                    if (j == 11 || j == 13 || j == 17 || j == 19 || j == 23 || j == 29 || j == 31 || j == 37 || j == 41 || j == 43 || j == 47 || j == 53 || j == 59 || j == 61 || j == 67 || j == 71 || j == 73 || j == 79 || j == 83 || j == 89 || j == 97) {

                        System.out.printf("%d%d%n", i, j);

                    }
                }
            }
        }
    }
}


