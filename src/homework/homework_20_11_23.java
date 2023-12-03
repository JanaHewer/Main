package homework;

import java.util.Scanner;

public class homework_20_11_23 {

    /*
    Задача1


С помощью цикла while написать метод, выводящий на экран куб числа
от 1 до заданного числа n.
static void printCube( int n )

Пример:для числа n=3
1 в кубе 1
2 в кубе 8
3 в кубе 27
     */

    public static void main(String[] args) {


        printCube (3);

    }

    static void printCube(int n) {
        int c = 0;
        int i = 1;


        while (i <= n) {
            c = i * i * i;
            i++;
            System.out.println(c);
        }
    }


}













