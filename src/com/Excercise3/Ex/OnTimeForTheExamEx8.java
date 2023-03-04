package com.Excercise3.Ex;

import java.util.Scanner;

public class OnTimeForTheExamEx8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;

        String output1 = "";
        String output2 = "";

        // On time

        if (arrivalTime <= examTime && arrivalTime >= examTime - 30) {
            output1 = "On time";
            int difference = examTime - arrivalTime;
            if (difference < 60) {
                output2 = String.format("%d minutes before the start", difference);
            }

        }
//        Early
        else if (arrivalTime < examTime - 30) {
            output1 = "Early";
            int difference = examTime - arrivalTime;

            if (difference < 60) {
                output2 = String.format("%d minutes before the start", difference);
            } else {
                int hours = difference / 60;
                int minutes = difference % 60;
                output2 = String.format("%d:%02d hours before the start", hours, minutes);
            }

//           Late
        } else if (arrivalTime > examTime) {
            output1 = "Late";
            int difference = arrivalTime - examTime;
            if (difference < 60) {
                output2 = String.format("%d minutes after the start", difference);
            } else {
                int hours = difference / 60;
                int minutes = difference % 60;
                output2 = String.format("%d:%02d hours after the start", hours, minutes);
            }
        }
        System.out.println(output1);
        System.out.println(output2);

    }
}