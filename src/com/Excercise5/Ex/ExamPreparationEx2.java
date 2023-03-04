package com.Excercise5.Ex;

import java.util.Scanner;

public class ExamPreparationEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGradesLimit = Integer.parseInt(scanner.nextLine());

        // Прочитаме първата задача

             int solvedProblemsCount = 0;

        String task = scanner.nextLine();
        int poorGrades = 0;
        int gradesCount = 0;
        int allGradesSum = 0;
        String currentTask = "";


//            boolean isFailed = true;
// докато съобщението е различно от Еnough
        while (!task.equals("Enough")) {
//            прочитаме оценката
            int grade = Integer.parseInt(scanner.nextLine());
            allGradesSum += grade;
            gradesCount++;

            if (grade <=4){
                poorGrades++;

                if (poorGrades == poorGradesLimit){
                    break;
                }
            }
            currentTask = task;
            task = scanner.nextLine();
        }
        double averageScore = 1.0 * allGradesSum / gradesCount;
        //     Принтиране
        String output = "";
        if (poorGrades == poorGradesLimit){
            output = String.format("You need a break, %d poor grades.", poorGrades);

        }else{
            output = String.format("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", averageScore, gradesCount, currentTask);

        }
        System.out.println(output);
    }
}
