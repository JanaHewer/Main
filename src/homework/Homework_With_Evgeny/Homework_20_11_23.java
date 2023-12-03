package homework.Homework_With_Evgeny;

public class Homework_20_11_23 {
    public static void main(String[] args) {
        printCube(3);
    }

    /*С помощью цикла while написать метод, выводящий на экран куб числа от 1 до заданного числа n.
static void printCube( int n )

Пример:для числа n=3

1 в кубе 1

2 в кубе 8

3 в кубе 27

     */


    static void printCube( int n ){
        int i =1;
        while (i <= n){

            System.out.println("The number is: " + i + " and cube of " + i + " is " + (i*i*i));
            i++;

        }
    }

    /*
    Задача2* (не обязательно)

Изменить код нашей игры "Угадай число" (см. урок 6, класс GuessNumber)
добавив цикл while таким образом, что игрок получает определенное количество
попыток для отгадывания числа. Игра должна заканчиваться в двух случаях -
либо отгадано секретное число либо закончилось количество попыток
     */

}
