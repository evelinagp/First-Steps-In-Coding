package com.Exsercise4.MoreEx;

import java.util.Scanner;

public class Grades4P {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentNumber = Integer.parseInt(scanner.nextLine());

        double studentGradeLessThan3 = 0;
        double studentGradeLessThan4 = 0;
        double studentGradeLessThan5 = 0;
        double studentGradeLessThan6 = 0;
        int studentNumberLessThan3 = 0;
        int studentNumberLessThan4 = 0;
        int studentNumberLessThan5 = 0;
        int studentNumberLessThan6 = 0;

        for (int i = 1; i <= studentNumber; i++) {
            double studentGrade = Double.parseDouble(scanner.nextLine());

            if (studentGrade < 3) {
                studentGradeLessThan3 += studentGrade;
                studentNumberLessThan3 ++;

            } else if (studentGrade >= 3 && studentGrade < 4) {
                studentGradeLessThan4 += studentGrade;
                studentNumberLessThan4 ++;
            } else if (studentGrade >= 4 && studentGrade < 5) {
                studentGradeLessThan5 += studentGrade;
                studentNumberLessThan5 ++;
            } else if (studentGrade>=5) {
                studentGradeLessThan6 += studentGrade;
                studentNumberLessThan6++;
            }
        }

        double average = (studentGradeLessThan3 + studentGradeLessThan4 + studentGradeLessThan5 + studentGradeLessThan6) / studentNumber;
        System.out.printf("Top students: %.2f%%%n", 1.0 *  studentNumberLessThan6/ studentNumber * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", 1.0 * studentNumberLessThan5 / studentNumber * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", 1.0 * studentNumberLessThan4 / studentNumber * 100);
        System.out.printf("Fail: %.2f%%%n", 1.0 *  studentNumberLessThan3 / studentNumber * 100);
        System.out.printf("Average: %.2f%n", 1.0 * average);
//        Ред 1 -	"Top students: {процент студенти с успех 5.00 или повече}%"
//        Ред 2 -	"Between 4.00 and 4.99: {между 4.00 и 4.99 включително}%"
//        Ред 3 -	"Between 3.00 and 3.99: {между 3.00 и 3.99 включително}%"
//        Ред 4 -	"Fail: {по-малко от 3.00}%"
//        Ред 5 -	"Average: {среден успех}"
//        Всички числа трябва да са форматирани до вторият знак след десетичната запетая.

    }
}
