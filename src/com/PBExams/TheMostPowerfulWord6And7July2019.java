package com.PBExams;

import java.util.Scanner;

public class TheMostPowerfulWord6And7July2019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();


        boolean hasVowel = false;
        double maxScore = 0;
        String mostPowerfulWord = "";
        while (!word.equals("End of words")) {
            double currentScore = 0;
            int wordLength = word.length();
            for (int i = 0; i < wordLength; i++) {
                int charLetter = word.charAt(i);
                if ((i == 0) && ((charLetter == 65) || (charLetter == 69) || (charLetter == 73) || (charLetter == 79) || (charLetter == 85) || (charLetter == 89) || ((charLetter == 97) || (charLetter == 101) || (charLetter == 105) || (charLetter == 111) || (charLetter == 117) || (charLetter == 131)))) {
                    hasVowel = true;
                }
                currentScore += charLetter;
            }
            if (hasVowel) {
                currentScore *= wordLength;
            } else {
                currentScore = Math.floor(currentScore / wordLength);
            }
            if (currentScore > maxScore) // >= брез равно дава 90/100
            {
                maxScore = currentScore;
                mostPowerfulWord = word;
            }
            word = scanner.nextLine();
            hasVowel = false;
        }
        System.out.printf("The most powerful word is %s - %.0f", mostPowerfulWord, maxScore);
    }
}

