package com.PBExams;

import java.util.Scanner;

public class Club6And7July2019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededProfit = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("Party!") || neededProfit < sum) {
            int number = Integer.parseInt(scanner.nextLine());
            int length = input.length();
            int price = length * number;
            if (price % 2 != 0) {
                sum += price * 0.75;
            } else {
                sum += price;
            }
            if (sum >=neededProfit){
                break;
            }
            input = scanner.nextLine();

        }
        if (sum >= neededProfit) {
            System.out.println("Target acquired.");
        } else {
            System.out.printf("We need %.2f leva more.%n", neededProfit - sum);
        }
        System.out.printf("Club income - %.2f leva.", sum);
    }
}
