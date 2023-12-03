package homework.homework_17_11_23;
/*
Написать метод, который принимает в качестве параметра
символ и проверяет является ли он гласной или согласной
буквой латинского алфавита.
В зависимости от введенного символа ch метод возвращает
следующую строку:
ch is a vowel ( это гласная)
ch is a consonant ( это согласная)
the symbol is not a letter ( символ не является буквой)

Буквы могут быть как заглавными, так и прописными.
При использовании сканера, для получения отдельного
символа используйте конструкцию scanner.next().charAt(0)
В решении используйте switch и оператор if-else
В методе main выведите полученный результат на печать
 */


import java.util.Scanner;
public class Homework_2 {
    public static void main(String[] args) {
        char character;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter");
        char letter = scanner.next().charAt(0);
        checkTheSymbol(letter);
    }
        static char checkTheSymbol(char letter) {
            if (Character.isLetter(letter)) {

                switch (letter) {

                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':

                        System.out.println("The letter is a vowel");
                        break;
                    default:
                        System.out.println("The letter is a consonant");


                }


            } else {
                System.out.println("The symbol " + letter + " is not a letter");
            }
            return letter;


        }

}







