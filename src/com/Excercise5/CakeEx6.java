package com.Excercise5;

import java.util.Scanner;

public class CakeEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
//        /брой парчета на тортата
        int cakePieces = length * width;
//        Прочитаме първият ред
        String line = scanner.nextLine();
        boolean isFinished = false;

//        Докато line е различно от STOP
        while (!line.equals("STOP")) {
            int currentPieces = Integer.parseInt(line);
            cakePieces -= currentPieces;
            if (cakePieces <= 0) {
                isFinished = true;
                break;
            }
            line = scanner.nextLine();
        }

        String output = "";

        if (isFinished){
            output = String.format("No more cake left! You need %d pieces more.",Math.abs(cakePieces));
        }else {
            output = String.format("%d pieces are left.", cakePieces);

        }
        System.out.println(output);
    }
}
