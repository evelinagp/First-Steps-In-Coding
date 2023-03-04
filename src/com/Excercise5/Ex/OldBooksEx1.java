package com.Excercise5.Ex;

import java.util.Scanner;

public class OldBooksEx1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String searchedBooks = scanner.nextLine();

        String currentBook = scanner.nextLine();

        boolean isFound = false;
        int bookCount = 0;

        while (!currentBook.equals("No More Books")) {

//            System.out.println(currentBook);

            if (currentBook.equals(searchedBooks)) {
                isFound = true;
                break;
            }
            bookCount++;
            currentBook = scanner.nextLine();
        }
        String output = "";

        if (isFound) {
            output = String.format("You checked %d books and found it.", bookCount);
            } else {
            output = String.format("The book you search is not here!%n" +
                    "You checked %d books.", bookCount);

        }
        System.out.println(output);
    }
}
