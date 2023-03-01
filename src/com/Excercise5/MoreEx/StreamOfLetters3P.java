package com.Excercise5;

import java.util.Scanner;

public class StreamOfLetters3P {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = "";
//        int count = 0;
        String letter = "";
//        булевите променливи помнят дали даден символ е сращнат вече веднъж
        boolean o = false;
        boolean c = false;
        boolean n = false;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            char valid = input.charAt(0);
            if ((valid >= 'a' && valid <= 'z') || (valid >= 'A' && valid <= 'Z')) {
//                когато има 'o' 'c' 'n' влиза в дадения case
                switch (input) {
                    case "o":
//    при първо среща на 'о' променливата о=false и не влиза в if след което о=true и при следваща среща о=true
//    и вече влиза в if и се преибавя към текущата дума
                        if (o){
                            word+=input;
                        }
                        o=true;
                        break;
                    case "c":
                        if (c){
                            word+=input;
                        }
                        c=true;
                        break;
                    case "n":
                        if (n){
                            word+=input;
                        }
                        n=true;
                        break;
                    default:
                        word+=input;
                        break;
                }
//                if (input.equals("o") || input.equals("c") || input.equals("n")) {
//                    if (input.equals(letter) && count > 0) {
//                        word += input;
//                    } else {
//                        count++;
//                        letter = input;
//                        word += "";
//                    }
//                } else {
//                    word += input;
//                }
//       когато сме срещнали и трите символа по веднъв влиза в if където печата и отново 'o'=false 'c'=false 'n'=false
                if (o && c && n) {
                    System.out.print(word + " ");
                    o = false;
                    c = false;
                    n = false;
//                    letter = "";
                    word = "";
                }
            }
            input = scanner.nextLine();


        }
    }
}










//        String result = " ";
//
//
//        boolean isCFound = false;
//        boolean isOFound = false;
//        boolean isNFound = false;
//
//
//        while (true) {
//            String expression = scanner.nextLine();
//
//            if (isCFound == true && isNFound == true && isNFound == true) {
//                System.out.println(result + " ");
//                result = "";
//                isCFound = false;
//                isOFound = false;
//                isNFound = false;
//            }
//            if (expression.equals("End")) {
//                break;
//            }
//            char letter = expression.charAt(0);
//
//            if (((int) letter >= 65 && (int) letter <= 90) || ((int) letter >= 97 && (int) letter <= 122)) {
//                if (letter == 'c' && isCFound == false) {
//                    isCFound = true;
//                    continue;
//                } else if (letter == 'c' && isCFound == true) {
//                    result = result + "" + letter;
//                    continue;
//                }
//
//                if (letter == 'o' && isOFound == false) {
//                    isOFound = true;
//                    continue;
//                } else if (letter == 'o' && isOFound == true) {
//                    result = result + "" + letter;
//                    continue;
//                }
//
//                if (letter == 'n' && isNFound == false) {
//                    isNFound = true;
//                    continue;
//                } else if (letter == 'n' && isNFound == true) {
//                    result = result + "" + letter;
//                    continue;
//                }
//
//                result = result + "" + letter;
//
//            } else {
//                continue;
//            }
//        }
//    }
//}

