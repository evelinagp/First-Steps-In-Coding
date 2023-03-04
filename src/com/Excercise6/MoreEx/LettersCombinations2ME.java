package com.Excercise6.MoreEx;

import java.util.Scanner;

public class LettersCombinations2ME {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.next().charAt(0);
        char lastLetter = scanner.next().charAt(0);
        char letterToSkip = scanner.next().charAt(0);

        int count = 0;
        for (char i = firstLetter; i <= lastLetter; i++) {
            for (char j = firstLetter; j <= lastLetter; j++) {
                for (char k = firstLetter; k <= lastLetter; k++) {
                    if (i != letterToSkip && j != letterToSkip && k != letterToSkip) {

                        System.out.printf("%s%s%s ", i, j, k);
                        count++;
                    }
                }
            }
        }
                    System.out.printf("%d", count);
    }
}

