package com.Exam;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int processorMustProduced = Integer.parseInt(scanner.nextLine());
        int employeeCount = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        int workingHours = 8;
        int timePerProcessor = 3;
        double processorPrice = 110.10;

        int totalHours = employeeCount * workingDays * workingHours;
        double producedProcessors = Math.floor(1.0 * totalHours / timePerProcessor);

        if (producedProcessors >= processorMustProduced) {
            double profit = (producedProcessors - processorMustProduced) * processorPrice;
            System.out.printf("Profit: -> %.2f BGN", profit);
        } else {
            double loses = (processorMustProduced - producedProcessors) * processorPrice;
            System.out.printf("Losses: -> %.2f BGN", loses);

        }
    }
}


