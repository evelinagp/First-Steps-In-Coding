package com.FinalExam;

import java.util.Scanner;

public class ExcursionSale2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numberSea = Integer.parseInt(scanner.nextLine());
            int numberMountain = Integer.parseInt(scanner.nextLine());

            double priceSea = 680.0;
            double priceMountain = 499.0;

            double sum = 0.0;

            while (true){
                String input = scanner.nextLine();
                if (input.equals("Stop")){
                    break;
                }
                if (input.equals("sea")){
                    if (numberSea == 0){
                        continue;
                    }else {
                        numberSea--;
                    }
                    sum += priceSea;
                }else if (input.equals("mountain")){
                    if (numberMountain == 0){
                        continue;
                    }else {
                        numberMountain--;
                    }
                    sum += priceMountain;
                }
                if (numberMountain == 0 && numberSea == 0){
                    System.out.println("Good job! Everything is sold.");
                    break;
                }
            }
            System.out.printf("Profit: %.0f leva.", sum);
        }
    }

