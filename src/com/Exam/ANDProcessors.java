package com.Exam;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int processorMustProduced = Integer.parseInt(scanner.nextLine());
        int employeeCount = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        String outcome = "";
        int workingHours = 8;
        int timePerProcessor = 3;
        double processorPrice = 110.10;

        int totalHours = employeeCount * workingDays * workingHours;
        double producedProcessors = Math.floor(totalHours/3);

        if (producedProcessors >=processorMustProduced){
            double profit = (producedProcessors - processorMustProduced) * 110.1;
            System.out.printf("Profit: -> %.2f BGN",profit);
        }else{
            double loses = (processorMustProduced - producedProcessors) * 110.1;
            System.out.printf("Losses: -> %.2f BGN", loses);

        }

    }
}


