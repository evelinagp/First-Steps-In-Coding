package com.Excercise6.MoreEx;

import java.util.Scanner;

public class Profit10ME {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int coins1lv = Integer.parseInt(scanner.nextLine());
        int coins2lv = Integer.parseInt(scanner.nextLine());
        int banknotes5lv = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        int amount1 = 1;
        int amount2 = 2;
        int amount3 = 5;
        for (int i = 0; i <= coins1lv; i++) {
            for (int j = 0; j <= coins2lv; j++) {
                for (int k = 0; k <= banknotes5lv; k++) {

                    if ((i * amount1) + (j * amount2) + (k * amount3) == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);

                    }
                }
            }
        }
    }
}
