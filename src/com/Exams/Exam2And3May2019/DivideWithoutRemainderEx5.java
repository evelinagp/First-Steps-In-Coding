package Exsercise4;

import java.util.Scanner;

public class DivideWithoutRemainderEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                p1++;

            }
            if (number % 3 == 0) {
                p2++;

            }
            if (number % 4 == 0) {
                p3++;

            }
        }
        System.out.printf("%.2f%%%n", 1.0 * p1 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * p2 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * p3 / n * 100);

    }
}

