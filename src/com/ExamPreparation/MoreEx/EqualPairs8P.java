package com.ExamPreparation;

import java.util.Scanner;

public class EqualPairs8P {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int lastSum = 0;
        int diff = 0;
        for (int i = 0; i < n; i++) {
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            int sum = first + second;

            if (i > 0) {
                diff = Math.abs(lastSum - sum);
            }
            lastSum = sum;
        }

        if (diff == 0) {
            System.out.printf("Yes, value=%s", lastSum);
        } else {
            System.out.printf("No, maxdiff=%s", diff);
        }
    }
}


//        int n = Integer.parseInt(scanner.nextLine());
//
//
//        int evenSum = 0;
//        int oddSum = 0;
//
//
//        int maxSum = -1000000000;
//        int minSum = 1000000000;
//
//
//        for (int i = 1; i <= n; i++) {
//            int number1 = Integer.parseInt(scanner.nextLine());
//            int number2 = Integer.parseInt(scanner.nextLine());
//
//            if (i % 2 == 0) {
//                evenSum = number1 + number2;
//                if ( evenSum> maxSum) {
//                    maxSum =  evenSum;
//                } else if ( evenSum < minSum) {
//                    minSum =  evenSum;
//                }
//            } else {
//                oddSum = number1 + number2;
//                if (oddSum > maxSum) {
//                    maxSum = oddSum;
//                } else if (oddSum < minSum) {
//                    minSum =oddSum;
//                }
//            }
//        }
//        if (oddSum==evenSum) {
//            System.out.printf("Yes, value=%d", oddSum);
//        } else {
//            System.out.printf("No, maxdiff=%d", maxSum - minSum);
//        }
//    }
//}
