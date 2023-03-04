package com.Excercise2.Lab;

import java.util.Scanner;

public class ExcellentResultLab1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >= 5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("The grade is smaller than 5!");
        }
    }
}
