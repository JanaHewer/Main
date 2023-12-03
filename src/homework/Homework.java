package homework;

public class Homework {
    /* Задача 1.
Написать программу, выводящую на экран результат
деления двух чисел 25 и 3. Результат не должен
быть округлен до целых. Посчитать также остаток
от деления этих чисел.
     */

    public static void main(String[] args) {

        int a = 25;
        int b = 3;
        int divide = a/b;
        System.out.println("the result of a/b = "+ divide);

        int remainder = a%b;
        System.out.println("the remainder is "+ remainder);

        double newDivide = 25.0/3;
        System.out.println("Double result " + newDivide);
        /* Задача 2.

Написать программу, выводящую на экран значение переменной типа
инт в квадрате. Предварительно обьявите эту переменную и задайте
ее значение
         */
      int x = 2;
      System.out.println(x*x);



    }
}
