package com.PBExams;

import java.util.Scanner;

public class TheMostPowerfulWord6And7July20192 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        boolean twice = false;
        double maxWord = 0;
        String powerWord = "";
        int wordLength = 0;

        while (!word.equals("End of words")) {
            double total = 0;
            total = 0;
            wordLength = 0;
            for (int i = 0; i < word.length(); i++) {
                wordLength++;
                int number = word.charAt(i);
                if (i == 0) {
                    if (number == 65 || number == 69 || number == 73 || number == 79 || number == 85 || number == 89 || number == 97 || number == 101 || number == 105 || number == 111 || number == 117 || number == 121) {
                        twice = true;
                    }
                }
                total += number;
            }
            if (twice == true) {
                total *= wordLength;
            } else {

                total = Math.floor(total / wordLength);
            }
            if (total > maxWord) {
                maxWord = total;
                powerWord = word;
            }
            word = scan.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", powerWord, maxWord);
    }
}