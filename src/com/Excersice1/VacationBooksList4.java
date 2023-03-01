package com.Excersice1;

import java.util.Scanner;

public class VacationBooksList4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1.	Брой страници в текущата книга – цяло число в интервала [1…1000];
//        2.	Страници, които може да прочита за 1 час – цяло число в интервала [1…1000];
//        3.	Броя на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000];
//     Изход - Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден..

        int pagesNum = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysNum = Integer.parseInt(scanner.nextLine());

        int totalTimeBook = pagesNum / pagesPerHour;

        int result = totalTimeBook / daysNum;

        System.out.println(result);

    }
}
