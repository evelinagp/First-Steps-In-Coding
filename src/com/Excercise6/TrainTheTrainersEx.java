package com.Excercise6;

import java.util.Scanner;

public class TrainTheTrainersEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        double presentationCounter = 0;
        double allGradeSum = 0;
        while (!line.equals("Finish")){
            String presentation = line;
            presentationCounter++;

            double gradesSum =0;
            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradesSum += grade;
            }
            double avrGrade = gradesSum/n;
            allGradeSum += avrGrade;
            System.out.printf(" %s - %.2f.%n", presentation, avrGrade);
            line = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allGradeSum/presentationCounter);
    }
}
