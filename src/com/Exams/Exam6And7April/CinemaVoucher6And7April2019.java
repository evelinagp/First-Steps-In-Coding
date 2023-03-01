package PBExams;

import java.util.Scanner;

public class CinemaVoucher6And7April2019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        double voucher = Double.parseDouble(scanner.nextLine());
        int voucher = Integer.parseInt(scanner.nextLine());
        int products = 0;
        int tickets = 0;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int length = input.length();
//            for (int i = 0; i < length; i++) {
            if (length <= 8) {
                int symbol = input.charAt(0);
                if (voucher <symbol) {
                    break;
                }
                voucher -= symbol;
                products++;
            } else {
                int symbol2 = input.charAt(0) + input.charAt(1);
                if (voucher < symbol2) {
                    break;
                }
                voucher -= symbol2;
                tickets++;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d%n", tickets);
        System.out.printf("%d", products);
    }
}

