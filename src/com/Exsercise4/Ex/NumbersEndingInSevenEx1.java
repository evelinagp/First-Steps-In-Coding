package com.Exsercise4.Ex;

import java.util.Scanner;

public class NumbersEndingInSevenEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 7; i <=997 ; i++) {
            if (i % 10 == 7){
                System.out.println(i);
            }
            
        }
    }
}
