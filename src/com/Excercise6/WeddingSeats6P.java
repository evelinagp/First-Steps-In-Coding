package com.Excercise6;

import java.util.Scanner;

public class WeddingSeats6P {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char sector = scanner.next().charAt(0);
        int rowsNumber = Integer.parseInt(scanner.nextLine());
        int placeNumberOdd = Integer.parseInt(scanner.nextLine());

//        int factor = 0;
        int counter = 0;

        for (char i ='A'; i <= sector; i++) {
            for (int j = 1; j <= rowsNumber; j++) {
               int factor = (j % 2 == 0) ? 2 : 0;
               for (char k = 'a'; k < 'a' + placeNumberOdd + factor; k++) {
                  System.out.printf("%c%d%c%n", i, j, k);
                    counter++;
               }
           }
       }
        System.out.printf("%d", counter);
   }
}
