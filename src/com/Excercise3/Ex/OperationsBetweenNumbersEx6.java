package com.Excercise3.Ex;

import java.util.Scanner;

public class OperationsBetweenNumbersEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int result = 0;
        String evenOrOdd = " ";


        switch (operator) {
            case "+":
                result = N1 + N2;

                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, evenOrOdd);
                break;

            case "-":
                result = N1 - N2;

                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, evenOrOdd);
                break;

            case "*":
                result = N1 * N2;

                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operator, N2, result, evenOrOdd);
                break;

            case "/":
//                result = N1 / N2;
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    double dividedResult = 1.0 * N1 / N2;
                    System.out.printf("%d / %d = %.2f", N1, N2, dividedResult);
                }
                break;

            case "%":

                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    result = N1 % N2;
                    System.out.printf("%d %% %d = %d", N1, N2, result);
                }
                break;


        }
    }
}

