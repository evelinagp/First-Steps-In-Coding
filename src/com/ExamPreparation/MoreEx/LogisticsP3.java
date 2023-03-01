package com.ExamPreparation;

import java.util.Scanner;

public class LogisticsP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loadsNumber = Integer.parseInt(scanner.nextLine());

        int loadPriceMicrobus = 200;
        int loadPriceTruck = 175;
        int loadPriceTrain = 120;


        int microbus = 0;
        int truck = 0;
        int train = 0;

//  •	До 3 тона – микробус (200 лева на тон)
//•	От 4 до 11 тона – камион (175 лева на тон)
//•	12 и повече тона – влак (120 лева на тон)
        for (int i = 1; i <= loadsNumber; i++) {
            int loadInTones = Integer.parseInt(scanner.nextLine());
            if (loadInTones <= 3) {
                microbus += loadInTones;

            } else if (loadInTones <= 11) {
                truck += loadInTones;

            } else {
                train += loadInTones;
            }
        }

        int sum = microbus + truck + train;
        System.out.printf("%.2f%n", 1.0 * ((microbus * loadPriceMicrobus) + (truck * loadPriceTruck) + (train * loadPriceTrain)) / sum);
        System.out.printf("%.2f%%%n", 1.0 * microbus / sum * 100);
        System.out.printf("%.2f%%%n", 1.0 * truck / sum * 100);
        System.out.printf("%.2f%%%n", 1.0 * train / sum * 100);
    }
}

