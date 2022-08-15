package com.Excersice1;

import java.util.Scanner;

public class FishTank8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Вход
//От конзолата се четат 4 реда:
//1.	Дължина в см – цяло число в интервала [10 … 500]
//2.	Широчина в см – цяло число в интервала [10 … 300]
//3.	Височина в см – цяло число в интервала [10… 200]
//4.	Процент  – реално число в интервала [0.000 … 100.000]
//Изход
//Да се отпечата на конзолата едно число:
//•	литрите вода, които ще  събира аквариума.
//Резултатът да се форматира до вторта цифра след десетичната запетая.
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int volumeCm = length * width * height;
        double volumeLiters = volumeCm * 0.001;

        double volumeNeeded = volumeLiters - (volumeLiters * (percentage/100));

        System.out.printf("%.2f", volumeNeeded);



    }
}
