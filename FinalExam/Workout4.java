package com.FinalExam;

import java.util.Scanner;

public class Workout4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workoutDays = Integer.parseInt(scanner.nextLine());

        double kilometers = Double.parseDouble(scanner.nextLine());

        double sum = kilometers;

        for (int i = 0; i < workoutDays; i++) {
            int percentages = Integer.parseInt(scanner.nextLine());
            kilometers = kilometers + kilometers * 1.0 * percentages / 100;
            sum += kilometers;
        }
        if (sum >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(sum - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - sum));
        }
    }
}


