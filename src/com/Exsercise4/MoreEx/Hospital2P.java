package com.Exsercise4.MoreEx;

import java.util.Scanner;

public class Hospital2P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int period = Integer.parseInt(scanner.nextLine());

        int untreatedPatients = 0;
        int treatedPatients = 0;
        int doctors = 7;

        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (untreatedPatients > treatedPatients && i % 3 == 0) {
                doctors += 1;
            }
            if (patients > doctors) {
                treatedPatients += doctors;
                untreatedPatients += patients - doctors;

            } else {
                treatedPatients += patients;

            }
        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}

