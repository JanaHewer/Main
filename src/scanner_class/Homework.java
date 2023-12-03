package scanner_class;
import java.util.Locale;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // String result = scanner.nextLine();

        double num1, num2;

        System.out.println("Enter first number: ");

        num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");

        num2 = scanner.nextDouble();

        System.out.println("Enter an operator (+,-,*,/)");

        String operator = scanner.next();

        switch (operator) {

            case "+":
                System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 + num2));
                break;

            case "-":
                System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 - num2));
                break;

            case "*":
                System.out.println(num1 + " " + operator + " " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by zero is forbidden");
                    break;
                }

                // else {
                System.out.println(num1 + " " + operator + " " + num2 + "=" + (num1 / num2));

                break;
            default:
                System.out.println("You have enter the wrong operator");
        }

        String hello = "Hello";
        char h = hello.charAt(0);
        System.out.println(h);
        System.out.println(hello.toUpperCase());
    }
}



