package com.Excercise6;

import java.util.Scanner;

public class ChallengeTheWedding5P {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());

        int tableCounter = 0;
        for (int j = 1; j <= men; j++) {
            for (int k = 1; k <= women; k++) {
                System.out.printf("(%d <-> %d) ", j, k);
                tableCounter++;
                if (tableCounter == maxTables) {
                    return;
                }
            }
        }
    }
}




