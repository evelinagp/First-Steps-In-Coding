package com.Excercise6.Ex;

import java.util.Scanner;

public class PasswordGeneratorEx5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i1 = 1; i1 < n; i1++) {
            for (int i2 = 1; i2 < n; i2++) {
                for (int i3 = 'a'; i3 < 'a' + l; i3++) {
                    for (int i4 = 'a'; i4 < 'a' + l; i4++) {
                        for (int i5 = 2; i5 <= n; i5++) {

                            if (i5 > i1 && i5 > i2) {
                                System.out.printf("%d%d%c%c%d ", i1, i2, i3, i4, i5);
                            }
                        }
                    }
                }
            }
        }
    }
}



