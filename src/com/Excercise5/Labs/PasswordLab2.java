package com.Excercise5.Labs;

import java.util.Scanner;

public class PasswordLab2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = scanner.nextLine();

        String inputPassword = scanner.nextLine();

        while (!password.equals(inputPassword)) {
            inputPassword = scanner.nextLine();

        }
            System.out.printf("Welcome %s!", userName);
    }
}
