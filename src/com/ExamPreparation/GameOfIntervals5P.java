package com.ExamPreparation;

import java.util.Scanner;

public class GameOfIntervals5P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movesNumberDuringGame = Integer.parseInt(scanner.nextLine());

        double result = 0;
        int numberCountLessThan10 = 0;
        int numberCountLessThan20 = 0;
        int numberCountLessThan30 = 0;
        int numberCountLessThan40 = 0;
        int numberCountLessThan50 = 0;
        int numberCountInvalid = 0;

        for (int i = 1; i <= movesNumberDuringGame; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (number >= 0 && number <= 9) {
                result += number * 0.2;
                numberCountLessThan10++;
            } else if (number >= 10 && number <= 19) {
                result += number * 0.3;
                numberCountLessThan20++;
            } else if (number >= 20 && number <= 29) {
                result += number * 0.4;
                numberCountLessThan30++;
            } else if (number >= 30 && number <= 39) {
                result += 50;
                numberCountLessThan40++;
            } else if (number >= 40 && number <= 50) {
                result += 100;
                numberCountLessThan50++;
            } else if (number >= 51 || number < 0) {
                result = result / 2;
                numberCountInvalid++;
            }
        }
        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", 1.0 * numberCountLessThan10 / movesNumberDuringGame * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", 1.0 * numberCountLessThan20 / movesNumberDuringGame * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", 1.0 * numberCountLessThan30 / movesNumberDuringGame * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", 1.0 * numberCountLessThan40 / movesNumberDuringGame * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", 1.0 * numberCountLessThan50 / movesNumberDuringGame * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", 1.0 * numberCountInvalid / movesNumberDuringGame * 100);

//        •	1ви ред: "{Краен резултат}"
//•	2ри ред: "From 0 to 9: {процент в интервала}%"
//•	3ти ред: "From 10 to 19: {процент в интервала}%"
//•	4ти ред: "From 20 to 29: {процент в интервала}%"
//•	5ти ред: "From 30 to 39: {процент в интервала}%"
//•	6ти ред: "From 40 to 50: {процент в интервала}%"
//•	7ми ред: "Invalid numbers: {процент в интервала}%"
    }
}
