package com.Excercise3.Lab;

import java.util.Scanner;

public class TradeCommissionsLab12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        if (sales < 0 || !city.equals("Plovdiv") || !city.equals("Sofia") || !city.equals("Varna")) {
            System.out.println("error");
            return;
        }
        double commission = 0.0;
        switch (city) {
            case "Sofia":

                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.05;
                } else if (sales <= 1000) {
                    commission = sales * 0.07;
                } else if (sales <= 10000) {
                    commission = sales * 0.08;

                } else if (sales > 10000) {
                    commission = sales * 0.12;
                }
                break;

            case "Varna":

                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.045;
                } else if (sales <= 1000) {
                    commission = sales * 0.075;
                } else if (sales <= 10000) {
                    commission = sales * 0.10;

                } else if (sales > 10000) {
                    commission = sales * 0.13;
                }
                break;

            case "Plovdiv":

                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.055;
                } else if (sales <= 1000) {
                    commission = sales * 0.08;
                } else if (sales <= 10000) {
                    commission = sales * 0.12;

                } else if (sales > 10000) {
                    commission = sales * 0.145;
                }
                break;

        }
            System.out.printf("%.2f", commission);
        }
    }

