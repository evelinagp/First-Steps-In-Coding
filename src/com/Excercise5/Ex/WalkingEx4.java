package com.Excercise5.Ex;

import java.util.Scanner;

public class WalkingEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int allStepsCount = 0;

        String command = scanner.nextLine();

        while (true) {
            if (command.equals("Going home")) {
                int goingHomeSteps = Integer.parseInt(scanner.nextLine());
                allStepsCount += goingHomeSteps;
                break;
            } else {
                int passedSteps = Integer.parseInt(command);
                allStepsCount += passedSteps;
                if (allStepsCount >= goal) {
                    break;
                }
            }
            command = scanner.nextLine();
        }
        if (allStepsCount >= goal) {
            System.out.printf("Goal reached! Good job!%n" + "%d steps over the goal!", allStepsCount - goal);
        } else {
            System.out.printf("%d more steps to reach goal.", goal - allStepsCount);

        }
    }
}




