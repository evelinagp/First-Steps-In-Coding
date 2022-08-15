package com.Excercise6;

import java.util.Scanner;

public class LettersCombinations2P {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        char c = scanner.next().charAt(0);

        int count = 0;
        for (char i = a; i <= b; i++) {
            for (char j = a; j <= b; j++) {
                for (char k = a; k <= b; k++) {
                    if (i != c && j != c && k != c) {

                        System.out.printf("%s%s%s ", i, j, k);
                        count++;
                    }
                }
            }
        }
                    System.out.printf("%d", count);
    }
}

