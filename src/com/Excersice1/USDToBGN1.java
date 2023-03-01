package com.Excersice1;

import java.util.Scanner;

public class USDToBGN1 {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        {double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;

        System.out.println(bgn);
        }
    }
}
