package com.ExamPreparation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      String text = scanner.nextLine();
      int length = text.length();

        for (int i = text.length()-1; i>=0 ; i-=2) {

        char symbol = text.charAt(i);
        System.out.print(symbol);
        }
    }
}










