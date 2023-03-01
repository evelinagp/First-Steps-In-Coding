package com.Excercise5;

import java.util.Scanner;

public class MovieRatingsExam6And7April2019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int filmsNumber = Integer.parseInt(scanner.nextLine());

        double maxRating = Integer.MIN_VALUE;
        double minRating = Integer.MAX_VALUE;
        double totalRating = 0;
        int i = 0;
        String filmNameMax = " ";
        String filmNameMin = " ";
        while (i < filmsNumber) {
            String currentFilm  = scanner.nextLine();
            double filmRating = Double.parseDouble(scanner.nextLine());
            i++;
            totalRating += filmRating;
            if (filmRating < minRating) {
                minRating = filmRating;
                filmNameMin = currentFilm;
            }if (filmRating > maxRating) {
                maxRating = filmRating;
                filmNameMax = currentFilm;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", filmNameMax, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", filmNameMin, minRating);
        System.out.printf("Average rating: %.1f", totalRating / filmsNumber);
    }
}
