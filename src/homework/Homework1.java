package homework;
/*import java.util.Scanner;

 */

public class Homework1 {
    public static void main(String[] args) {

    /* Task 1

Написать программу, которая принимает с клавиатуры имя ,
фамилию и возраст (Ваши или воображаемого персонажа) и
выводит в консоль эту информацию в следующем виде:

First name: John

Last name: Smith

Age: 25


        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a first name");
        String name = myScanner.nextLine();

        System.out.println("Enter a last name");
        String secondName = myScanner.nextLine();

        System.out.println("Enter age");
        int age = myScanner.nextInt();

        System.out.println("First name: " + name + "\nLast name: " + secondName + "\nAge: " + age);

        myScanner.close();
        */
               /* Task 2

Написать программу, выводящую на экран ASCII значение символа.
Пример: 'А' результат - 65

         */
      /*
        char ch;

        ch = 'H';
        int
        System.out.println(+ 'H');

       */







/*
Task 3*
Есть 2 целочисленные переменные a и b. Пусть a = 1, b =2.
С помощью оператора присваивания и математических действий
сложения и вычитания поменять значения a и b местами. т.е.
должно быть в результате a =2, b=1. Просто присвоить a и b
эти значения или вводить третью переменную нельзя. Задача
должна быть решена для общего случая, т.е. для любых двух
значений переменных, 1 и 2 просто пример. Если не получится с
двумя переменными, можно попробовать более легкий вариант решения
с введением третьей дополнительной переменной.
 */

// вариант 1:

int a = 1;
int b = 2;

a = a+b;
b = a-b; // 1 + 2 -2
a = a-b; // 3 - 1
        System.out.println(" a = "+ a + "\n b = " +b);

        // вариант 2:
        int A = 10;
        int B = 12;

        A = A + B - (B = A);
        // 10 + 12 - (10)
        // A = 12

        System.out.println("A now is " + A + " ,B now is " + B);

        // вариант 3:

        int x = 4;
        int y = 5;
        int temp = x;

        x = y; // x = 5
        y = temp; // y = 4
        System.out.println("x = " +x);
        System.out.println("y = " + y);


    }


                }





