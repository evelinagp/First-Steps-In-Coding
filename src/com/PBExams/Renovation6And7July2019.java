package com.PBExams;

import java.util.Scanner;

public class Renovation6And7July2019 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percentageNotPainted = Integer.parseInt(scanner.nextLine());

        int painting = (height * width * 4) - (height * width * 4)* percentageNotPainted/100;

        int sumPaint = 0;
        String input = scanner.nextLine();
        while (!input.equals("Tired!")) {
            int litrePaint = Integer.parseInt(input);
            sumPaint += litrePaint;
            if (sumPaint >= painting){
               break;
            }
         input = scanner.nextLine();
        }
        if (input.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.", Math.ceil(painting - sumPaint));
        }else if (sumPaint == painting){
           System.out.println("All walls are painted! Great job, Pesho!");
        }else {
            System.out.printf("All walls are painted and you have %d l paint left!", sumPaint - painting);
        }
    }
}
