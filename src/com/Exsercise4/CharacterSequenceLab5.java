package com.Exsercise4;

import java.util.Scanner;

public class CharacterSequenceLab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int length = text.length();
//    hello
//    01234

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));

        }
    }
}

