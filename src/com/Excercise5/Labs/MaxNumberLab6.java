package com.Excercise5.Labs;

import java.util.Scanner;

public class MaxNumberLab6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        int maxNumber = Integer.MIN_VALUE;
        while (!n.equals("Stop")) {
            int number = Integer.parseInt(n);
            if (number > maxNumber) {
                maxNumber = number;
            }
            n = scanner.nextLine();
        }
            System.out.println(maxNumber);
    }
}
