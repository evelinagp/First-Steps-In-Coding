package com.Excercise6.Lab;

public class MultiplicationTableLab2 {

    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                int product = x * y;
                System.out.printf("%d * %d = %d%n", x, y, product);
            }
        }
    }
}
