package com.ExamPreparation.ExamPrepSeptember2020;

import java.util.Scanner;

public class Repainting1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//  1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
//2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
//3.	Количество разредител (в литри) - цяло число в интервала [1…30]
//4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]

        int nylonNeeded = Integer.parseInt(scanner.nextLine());
        int paintNeeded = Integer.parseInt(scanner.nextLine());
        int thinnerNeeded = Integer.parseInt(scanner.nextLine());
        int workersWorkingHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = 1.5 * (nylonNeeded + 2);
        double paintPrice = 14.5 * (paintNeeded * 1.1);
        double thinnerPrice = 5 * thinnerNeeded;

        double totalPrice = nylonPrice + paintPrice + thinnerPrice + 0.4;
        double workersSalaryPerHour = totalPrice * 0.3;
        double workersTotalSalary = workersSalaryPerHour * workersWorkingHours;

        System.out.printf("Total expenses: %.2f lv.", totalPrice + workersTotalSalary);


    }
}
