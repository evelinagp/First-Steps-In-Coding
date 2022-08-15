package com.Excersice1;

import java.util.Scanner;

public class BirthdayParty5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Наем за залата – цяло число в интервала [100..10000]
// •	Торта  – цената ѝ е 20% от наема на залата
//•	Напитки – цената им е 45% по-малко от тази на тортата
//•	Аниматор – цената му е 1/3 от цената за наема на залата

//        Изход
//        Да се отпечата на конзолата какъв бюджет ще бъде необходим за организиране на тържеството.

        int hallRent  = Integer.parseInt(scanner.nextLine());
        double cakePrice = hallRent * 0.2;
        double drinksPrice = cakePrice - cakePrice * 0.45;
        int animatorPrice = hallRent / 3;

        double result = hallRent + cakePrice + drinksPrice + animatorPrice;

        System.out.println(result);



    }
}
