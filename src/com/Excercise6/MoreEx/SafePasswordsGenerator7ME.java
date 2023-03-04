package com.Excercise6.MoreEx;

import java.util.Scanner;

public class SafePasswordsGenerator7ME {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());


        int counter = 0;
        char A = 35;
        char B = 64;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.printf("%c%c%d%d%c%c|", A, B, i, j, B, A);
                counter++;
                B++;
                A++;
                if (A > 55) {
                    A = 35;
                }
                if (B > 96) {
                    B = 64;
                }
                if (counter >= maxPasswords|| i == a && j == b) {
                return;
                    }
                }
            }
        }
    }
