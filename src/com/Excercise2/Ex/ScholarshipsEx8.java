package com.Excercise2.Ex;

import java.util.Scanner;

public class ScholarshipsEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());
//доход на член от семейството по-малък от минималната работна заплата и успех над 4.5
        double socialScholarship = 0.0;
        double excellentScholarship = 0.0;

        if (income < minSalary){

            if (averageGrade > 4.5){
                socialScholarship = Math.floor(minSalary * 0.35);
                            }
                  }
        if (averageGrade >= 5.5) {
            excellentScholarship = Math.floor(averageGrade * 25); }

        boolean isSocial = false;

        if (socialScholarship != 0) {
            if (socialScholarship > excellentScholarship ){
                System.out.printf("You get a Social scholarship %.0f BGN",socialScholarship);
                isSocial = true;
            }
                   }
        if (excellentScholarship != 0){
            if (!isSocial){
                System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
                           }
}
        if (socialScholarship == 0){
            if (excellentScholarship == 0){
                System.out.println("You cannot get a scholarship!");
            }
    }
}
}

