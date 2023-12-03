package homework.Homework_With_Evgeny;

import java.util.Scanner;

public class GuessNumber {

    /*
    Задача2* (не обязательно)

Изменить код нашей игры "Угадай число" (см. урок 6, класс GuessNumber)
добавив цикл while таким образом, что игрок получает определенное
количество попыток для отгадывания числа. Игра должна заканчиваться в двух случаях
- либо отгадано секретное число либо закончилось количество попыток

     */
    public static void main(String[] args) {
        guessNumber();

    }
    static void guessNumber() {

        Scanner scanner = new Scanner(System.in);
        int secretNumber = 5;
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("Guess a number between 0 and 9");
            int answer = scanner.nextInt();
            attempts --;

            if (answer == secretNumber) {
                System.out.println("You are right! You have guessed the secret number !");
                return; // чтобы закрыть метод после верного ответа!

            }
            else {
                //   System.out.println("Sorry, you are wrong!");
                System.out.print("Sorry, the number  ");

                //  вложенный if
                if (answer < secretNumber)
                    System.out.println("is too small");
                else System.out.println("is too big");

                System.out.println("You have " + attempts + " attempts left");
            }

        }
        System.out.println("Sorry, buddy. Maybe some other time");
    }
    }



