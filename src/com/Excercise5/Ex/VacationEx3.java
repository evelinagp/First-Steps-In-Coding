package com.Excercise5;

import java.util.Scanner;

public class VacationEx3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int spendDays = 0;
        int allDays = 0;
//        Докато Джеси събере парите за почивака

        while (excursionPrice > currentMoney) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            allDays++;
            if (command.equals("spend")) {
                currentMoney -= money;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
                // Ако 5 последователни дни само харчи
                spendDays++;
                if (spendDays == 5) {
                    break;
                }
                } else {
                    currentMoney += money;
                    spendDays = 0;
                }
            }


        String output = "";

        if (currentMoney >= excursionPrice) {
            output = String.format("You saved the money for %d days.", allDays);
        } else {
            output = String.format("You can't save the money.%n" +
                    "%d", allDays);
        }
        System.out.println(output);
    }
}




