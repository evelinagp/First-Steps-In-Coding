package com.Excercise6.MoreEx;

import java.util.Scanner;

public class TheSongOfTheWheels12ME {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        int i = 1;
        int f = 1;
        int g = 1;
        int h = 1;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d && ((a * b) + (c * d) == m)) {
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                            counter++;
                            if (counter == 4) {
                                i = a;
                                f = b;
                                g = c;
                                h = d;
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        if (counter >= 4) {
            System.out.printf("Password: %d%d%d%d%n", i, f, g, h);
        } else {
            System.out.print("No!");
        }
    }
}


