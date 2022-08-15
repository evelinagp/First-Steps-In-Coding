package com.Excercise6;

import java.util.Scanner;

public class TrainTheTrainersEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        double allGradesSum =0.0;
        int countPresentation =0;
        while (!line.equals("Finish")){
            String presentation = line;
            countPresentation ++;

            double gradeSum = 0.0;
            double avrGrade =0.0;
            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradeSum += grade;
            }
            avrGrade = gradeSum/n;
            allGradesSum += avrGrade;
            System.out.printf("%s - %.2f.%n", presentation,avrGrade);

            line = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allGradesSum/countPresentation);
    }
}
