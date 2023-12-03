package homework;
/* Задача 1

Напишите метод калькулятор, который в зависимости от
ввода пользователя выполняет сложение, вычитание,
умножение или деление. Пользователь вводит оба числа,
затем знак операции (+, -, * или /). В зависимости от
введенного знака программа выполняет выбранное действие
и выводит полученный результат на экран. При написании метода
используйте Switch.

         */
 import java.util.Scanner;
public class Homework_5 {
    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);
        System.out.println(" Enter two numbers: ");
        int numb1 = calculator.nextInt();
        int numb2 = calculator.nextInt();
        System.out.println("Enter (+, -, *, /): ");
        String op = calculator.next();


        switch (op) {
            case "+":
                System.out.println(" = " + (numb1 + numb2));
                break;
            case "-":
                System.out.println(" = " + (numb1 - numb2));
                break;
            case "*":
                System.out.println(" = " + (numb1 * numb2));
                break;
            case "/":
                System.out.println(" = " + (numb1 / numb2));
                break;

            default:
                System.out.println("Error");


        }
    }
}