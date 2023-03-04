package com.Excersice1;

import java.util.Scanner;

public class FruitMarket7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Вход
//От конзолата се четат 5 реда:
//1.	Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
//2.	Количеството бананите в килограми – реално число в интервала [0.00 … 10000.00]
//3.	Количеството портокалите в килограми – реално число в интервала [0.00 … 10000.00]
//4.	Количеството малините в килограми – реално число в интервала [0.00 … 10000.00]
//5.	Количеството ягодите в килограми – реално число в интервала [0.00 … 10000.00]

//        •	цената на малините е с 50% по-ниска от тази на ягодите;
//•	цената на портокалите е с 40% по-ниска от цената на малините;
//•	цената на бананите е с 80% по-ниска от цената на малините.

//        Изход
//•	парите, които са необходими на Мария.
//Резултатът да се форматира до вторта цифра след десетичната запетая.

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double raspberry = Double.parseDouble(scanner.nextLine());
        double strawberry = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice * 0.5;
        double orangesPrice = raspberryPrice - raspberryPrice * 0.4;
        double bananasPrice = raspberryPrice - raspberryPrice * 0.8;

        double strawberryAmount = strawberryPrice * strawberry;
        double bananasAmount = bananasPrice * bananas;
        double orangesAmount = orangesPrice * oranges;
        double raspberryAmount = raspberryPrice * raspberry;

        double result = strawberryAmount + raspberryAmount + bananasAmount + orangesAmount;

        System.out.printf("%.2f", result);

    }
}
