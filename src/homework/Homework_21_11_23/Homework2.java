package homework.Homework_21_11_23;

public class Homework2 {

    /*
    Задача 2*

Написать метод, выводящий на печать треугольник, состоящий из цифр
от 1 до числа n такого вида:
1
12
123
1234
12345
123456
     */

    public static void main(String[] args) {

        int i = 1;
        int n = 6;

        while (i <= n){

            int j = 1;
            while (j <= i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    }


