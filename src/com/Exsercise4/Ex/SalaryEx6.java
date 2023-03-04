package com.Exsercise4.Ex;

import java.util.Scanner;

public class SalaryEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tabs; i++) {
            String currentTab = scanner.nextLine();

            if (currentTab.equals("Facebook")) {
                salary -= 150;

            } else if (currentTab.equals("Instagram")) {
                salary -= 100;
            } else if (currentTab.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                break;
            }
        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);


        }


    }
}





