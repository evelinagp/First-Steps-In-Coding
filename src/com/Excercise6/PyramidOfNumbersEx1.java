package com.Excercise6;

import java.util.Scanner;

public class PyramidOfNumbersEx1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int number = 0;
        boolean isEquals = false;
        for (int rows = 1; rows <= n; rows++) {

            for (int cols = 1; cols <= rows; cols++) {
                number++;
                System.out.print(number + " ");
                if (number >= n) {
                    isEquals = true;
                    break;
                }
            }
            if (isEquals) {
                break;
            }
            System.out.println();
        }
    }
}

