package com.Exsercise4.Lab;

import java.util.Scanner;

public class Numbers1ToNwithStep3Lab3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= n; i+=3) {
                System.out.println(i);
            }
        }
    }


