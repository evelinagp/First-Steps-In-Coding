package com.Excercise2.Ex;

import java.util.Scanner;

public class SumSecondsEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int totalSeconds = first + second + third;

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
                    }
        else {
            System.out.printf("%d:%d", minutes, seconds);
    }
}
}
