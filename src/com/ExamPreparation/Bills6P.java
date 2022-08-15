package com.ExamPreparation;

import java.util.Scanner;

public class Bills6P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthNumber = Integer.parseInt(scanner.nextLine());


        double electricityCostTotal = 0;
        int waterCost = 20;
        int internetCost = 15;
        int waterCostTotal = waterCost * monthNumber;
        int internetCostTotal = internetCost * monthNumber;
        double otherCostTotal = 0;


        for (int i = 1; i <= monthNumber; i++) {
            double electricityCost = Double.parseDouble(scanner.nextLine());
            electricityCostTotal += electricityCost;
            double otherCost = (electricityCost + waterCost + internetCost) * 1.2;
            otherCostTotal += otherCost;
//            •	за други – събират се тока, водата и интернета за месеца и към сумата се прибавят 20%.
        }
        double average = (electricityCostTotal + waterCostTotal + internetCostTotal + otherCostTotal) / monthNumber;
        System.out.printf("Electricity: %.2f lv%n", electricityCostTotal);
        System.out.printf("Water: %.2f lv%n", 1.0 * waterCostTotal);
        System.out.printf("Internet: %.2f lv%n", 1.0 * internetCostTotal);
        System.out.printf("Other: %.2f lv%n", otherCostTotal);
        System.out.printf("Average: %.2f lv%n", average);
    }
}
