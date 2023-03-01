package com.Excercise5;

import java.util.Scanner;

public class WalkingEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passedStepsCount = Integer.parseInt(scanner.nextLine());

        boolean isReached = false;
        int goal = 10000;
        int exceededGoal = 0;
        int allStepsCount = 0;


        while (passedStepsCount < goal) {
            allStepsCount += passedStepsCount;
            passedStepsCount++;

            String command = scanner.nextLine();
            if (command.equals("Going home")) ;
            {
                int goingHomeSteps = Integer.parseInt(scanner.nextLine());
                isReached = true;
                break;
            }


        }

        String output = "";

        if (isReached) {
            output = String.format("Goal reached! Good job!%n" + "%d steps over the goal!", exceededGoal - goal);
        } else {
            output = String.format("%d more steps to reach goal.", goal - passedStepsCount);

        }
        System.out.println(output);
    }
}




