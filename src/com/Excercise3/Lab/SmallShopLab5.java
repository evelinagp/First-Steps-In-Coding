package com.Excercise3.Lab;

import java.util.Scanner;

public class SmallShopLab5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());


        if ("coffee".equals(product)){
            if ("Sofia".equals(city)) {
                System.out.println(quantity * 0.5);
            }else if ("Plovdiv".equals(city)) {
                System.out.println(quantity * 0.4);
            }else if ("Varna".equals(city)) {
                System.out.println(quantity * 0.45);

    }
}
        if ("water".equals(product)){
            if ("Sofia".equals(city)) {
                quantity = quantity * 0.8;
                System.out.printf ("%.1f", quantity);
            }else if ("Plovdiv".equals(city)) {
                quantity = quantity * 0.7;
                System.out.printf ("%.1f", quantity);
            }else if ("Varna".equals(city)) {
                quantity = quantity * 0.7;
                System.out.printf("%.1f", quantity);
}
}

        if ("beer".equals(product)){
            if ("Sofia".equals(city)) {
                quantity = quantity * 1.20;
                System.out.printf ("%.1f", quantity);
            }else if ("Plovdiv".equals(city)) {
                quantity = quantity * 1.15;
                System.out.printf ("%.1f", quantity);
            }else if ("Varna".equals(city)) {
                quantity = quantity * 1.10;
                System.out.printf ("%.1f", quantity);
}
}
        if ("sweets".equals(product)){
            if ("Sofia".equals(city)) {
                quantity = quantity * 1.45;
                System.out.printf ("%.4f", quantity);
            }else if ("Plovdiv".equals(city)) {
                quantity = quantity * 1.30;
                System.out.printf ("%.4f", quantity);
            }else if ("Varna".equals(city)) {
                quantity = quantity * 1.35;
                System.out.printf ("%.4f", quantity);
}
}
        if ("peanuts".equals(product)){
            if ("Sofia".equals(city)) {
                quantity = quantity * 1.60;
                System.out.printf ("%.1f", quantity);
            }else if ("Plovdiv".equals(city)) {
                quantity = quantity * 1.50;
                System.out.printf ("%.1f", quantity);
            }else if ("Varna".equals(city)) {
                quantity = quantity * 1.55;
                System.out.printf ("%.1f", quantity);
}
}
}
}

