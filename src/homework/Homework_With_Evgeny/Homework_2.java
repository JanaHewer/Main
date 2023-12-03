package homework.Homework_With_Evgeny;

import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter number");
       // int number = scanner.nextInt();

        //System.out.println(detectSign(number));

        System.out.println("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        scanner.close();

        System.out.println(findVowelConsonant(ch));

    }
    // Aufgabe 1

    static String detectSign(int n) {

        if (n > 0) {
            return "Number is positive";
        }
        if ((n < 0)) {

            return "Number is negative";
        } else {
            return "Number is zero";

        }


        // Aufgabe 2:

    }

    static String findVowelConsonant(char ch) {

        boolean isVowel = false;
        switch (ch) {
            case 'a':
            case 'i':
            case 'e':
            case 'u':
            case 'o':
            case 'A':
            case 'I':
            case 'E':
            case 'U':
            case 'O': isVowel = true;

        }
        String result;
        if (isVowel) {
            result = ch + "is a vowel";
        }
        else {
            if ((ch <='z' &&  ch >='a') || (ch <= 'Z' && ch >= 'A')) {
                result = ch + " is a consonant";
            }
            else {
                result = ch + " is not a letter";
            }

        }
        return result;

    }
}