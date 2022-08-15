package com.PBExams;

import java.util.Scanner;

public class HighJump9And10March2019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int goal = Integer.parseInt(scanner.nextLine());
        int unsuccessfulJumps = 0;
        int jumpsTotal = 0;

        for (int i = goal - 30; i <= goal;) {
            int jump = Integer.parseInt(scanner.nextLine());
            jumpsTotal++;

            if (jump > i) {
                i +=5;
                unsuccessfulJumps = 0;
            } else {
                unsuccessfulJumps++;
            }
            if (unsuccessfulJumps == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", i, jumpsTotal);
                return;
            }
        }
        System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", goal, jumpsTotal);
    }
}