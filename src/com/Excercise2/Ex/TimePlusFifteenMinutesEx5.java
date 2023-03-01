package com;

import java.util.Scanner;

public class TimePlusFifteenMinutes5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

       int timeBefore15Min = hours * 60 + minutes ;
       int timeAfter15Min = timeBefore15Min + 15 ;
       int finalTime = timeAfter15Min / 60;
       int finalMinutes = timeAfter15Min % 60;

       if (finalTime == 24){
           finalTime = 0;
       }

        if (finalMinutes < 10) {
            System.out.printf("%d:0%d", finalTime, finalMinutes );
        }
        else {
            System.out.printf("%d:%d", finalTime, finalMinutes );

    }


        }
}
