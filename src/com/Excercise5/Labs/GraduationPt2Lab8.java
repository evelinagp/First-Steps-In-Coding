package com.Excercise5;

import java.util.Scanner;

public class GraduationPt2Lab8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();

        double grades = 0.0;
        int badGradesCounter = 0;
        int clazz = 0;

        while (clazz < 12) {
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade < 4) {
                badGradesCounter++;
                if (badGradesCounter == 2) {
                    break;
                }
                continue;
            }
            clazz++;
            grades += currentGrade;
        }
        if (clazz == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, grades / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade ", studentName, ++clazz);
        }
    }
}
