package homework;

public class Homework_4 {
    public static void main(String[] args) {

        /*
        Задача 1

Есть две переменные целого типа. Написать программу,
выводящую на экран сумму их значений, а в том в случае,
если эти числа равны, должна выводиться двойная сумма.
Пример: 1 + 2 -> 3
3 + 2 -> 5
2 + 2 -> 8
         */
    /*    int a = 2;
        int b = 2;

        if(a == b) {
            System.out.println((a + b)*2);
        }
        else {
            System.out.println(a + b);
        }
        /*
     */

        /*
        Задача 2

Есть три переменные целого типа. Написать программу,
которая сравнивает эти числа и выводит на экран результат:

    All numbers are equal если они равны
    All numbers are different если все они все разные
    Some numbers are equal если какие-то из них равны

         */

        int A = 5;
        int B = 2;
        int C = 13;

        if ((A == B)&&(A == C)){
            System.out.println("All numbers are equal");
        } else if ((A != B) && (A != C) && (B != C)) {
            System.out.println("All numbers are different");
        }
        else
            System.out.println("Some numbers are equal");


    }
}
