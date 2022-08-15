package com.Excercise5;

import java.util.Scanner;

public class OscarsExam15And16June2019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academicPoints = Double.parseDouble(scanner.nextLine());
        int examinerNumber = Integer.parseInt(scanner.nextLine());

        int i = 0;
//        double totalExaminerPoints = 0;
        while (i < examinerNumber) {
            i++;
            String examinerName = scanner.nextLine();
            double examinerPoints = Double.parseDouble(scanner.nextLine());
            int length = examinerName.length();
            academicPoints += (length * examinerPoints) / 2;
            if (academicPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, academicPoints);
                return;
            }
        }
        System.out.printf(" Sorry, %s you need %.1f more!", actorName, 1250.5 - academicPoints);
    }
}


