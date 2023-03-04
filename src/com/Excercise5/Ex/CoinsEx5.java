package com.Excercise5.Ex;

import java.util.Scanner;

public class CoinsEx5 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        change = Math.floor(change * 100);

        int coinsCounter = 0;

        while (change > 0) {
            if (change >= 200) {
                coinsCounter++;
                change -= 200;
            } else if (change >= 100) {
                coinsCounter++;
                change -= 100;
            } else if (change >= 50) {
                coinsCounter++;
                change -= 50;
            } else if (change >= 20) {
                coinsCounter++;
                change -= 20;
            } else if (change >= 10) {
                coinsCounter++;
                change -= 10;
            } else if (change >= 5) {
                coinsCounter++;
                change -= 5;
            } else if (change >= 2) {
                coinsCounter++;
                change -= 2;
            } else if (change >= 1) {
                coinsCounter++;
                change -= 1;

            }
        }
        System.out.println(coinsCounter );
    }
}
