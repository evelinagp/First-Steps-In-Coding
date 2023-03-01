package com.Excersice1;

import java.util.Scanner;

public class CharityCampaign6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Вход
//1.	Броят на дните, в които тече кампанията – цяло число в интервала [0 … 365]
//2.	Броят на сладкарите – цяло число в интервала [0 … 1000]
//3.	Броят на тортите – цяло число в интервала [0… 2000]
//4.	Броят на гофретите – цяло число в интервала [0 … 2000]
//5.	Броят на палачинките – цяло число в интервала [0 … 2000]

        int campaignDays = Integer.parseInt(scanner.nextLine());
        int bakersCount = Integer.parseInt(scanner.nextLine());
        int cakesCounts = Integer.parseInt(scanner.nextLine());
        int wafflesCount = Integer.parseInt(scanner.nextLine());
        int pancakesCount = Integer.parseInt(scanner.nextLine());

        int cakesTotalAmount = cakesCounts * 45;
        double wafflesTotalAmount = wafflesCount * 5.8;
        double pancakesTotalAmount = pancakesCount * 3.2;

        double bakersTotalAmount =  (cakesTotalAmount + wafflesTotalAmount + pancakesTotalAmount) * bakersCount;

        double campaignTotalAmount = bakersTotalAmount * campaignDays;

//        double amountDeduction = cakesTotalAmount /8;

        double result = campaignTotalAmount - (campaignTotalAmount /8);

        System.out.printf ("%.2f", result);














//   •	Торта - 45 лв.
//•	Гофрета - 5.80 лв.
//•	Палачинка - 3.20 лв.
//   1/8 от крайната сума ще бъде използвана за покриване на разходите за продуктите по време на кампанията. Да се напише програма, която изчислява сумата, която е събрана в края на кампанията.

//Изход
//Да се отпечата на конзолата едно число:
//•	парите, които са събрани.
//Резултатът да се форматира до вторта цифра след десетичната запетая.

    }
}
