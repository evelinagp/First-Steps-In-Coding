package com.Excercise5;

import java.util.Scanner;

public class Dishwasher1P {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bottlesDetergent = Integer.parseInt(scanner.nextLine());

        int detergentMl = 750 * bottlesDetergent;

        String input = scanner.nextLine();

        boolean isFinished = false;

        int dishesCount = 1;
        int potsSum = 0;
        int platesSum = 0;

        while (!input.equals("End")) {

            int dishesQuantity = Integer.parseInt(input);
            if (dishesCount % 3 == 0) {
                detergentMl -= dishesQuantity * 15;
                potsSum += dishesQuantity;
            } else {
                detergentMl -= dishesQuantity * 5;
                platesSum += dishesQuantity;
            }
            if (detergentMl <= 0) {
                isFinished = true;
                break;
            }
            dishesCount++;
            input = scanner.nextLine();
        }
        if (isFinished) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentMl));
        } else {
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n", platesSum, potsSum);
            System.out.printf("Leftover detergent %d ml.", detergentMl);

        }
    }
}
