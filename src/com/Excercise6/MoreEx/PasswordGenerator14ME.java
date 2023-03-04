package com.Excercise6.MoreEx;

import java.util.Scanner;

public class PasswordGenerator14ME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumber = Integer.parseInt(scanner.nextLine());
        int lnumber = Integer.parseInt(scanner.nextLine());
        for (int i1 = 1; i1 < nNumber; i1++) {
            for (int i2 = 1; i2 < nNumber; i2++) {
                for (int i3 = 'a'; i3 < 'a' + lnumber; i3++) {
                    for (int i4 = 'a'; i4 < 'a' + lnumber; i4++) {
                        for (int i5 = 2; i5 <= nNumber; i5++) {

                            if (i5 > i1 && i5 > i2) {
                                System.out.printf("%d%d%c%c%d ", i1,i2,i3 ,i4 , i5);
                            }
                        }
                    }
                }
            }
        }
    }
}
