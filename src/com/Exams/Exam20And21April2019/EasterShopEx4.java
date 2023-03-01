package ExamPreparation;

import java.util.Scanner;

public class EasterShopEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEggAmount = Integer.parseInt(scanner.nextLine());

        String command = "";

        int soldEggs = 0;


        while (!"Close".equals(command = scanner.nextLine())) {

            int amount = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case "Buy":
                    soldEggs += amount;
                    int eggsNow = initialEggAmount;
                    initialEggAmount -= amount;
                    if (initialEggAmount < 0) {
                        System.out.println("Not enough eggs in store!");
                        System.out.printf("You can buy only %d.%n", Math.abs(eggsNow));
                        return;
                    }
                    break;
                case "Fill":
                    initialEggAmount += amount;
                    break;
            }
        }

        System.out.println("Store is closed!");
        System.out.printf("%d eggs sold.%n", soldEggs);
    }
}