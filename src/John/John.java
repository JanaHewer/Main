public class John {

    public static void main(String[] args) {

        /*
        Джон рано встает на работу и поэтому рано ложится спать. Сосед Джона любит слушать громкую
    музыку. Поэтому  у Джона проблемы если сосед слушает музыку и еще нет 7 утра или уже позже 20 часов.
    Нужно написать метод, возвращающий true  если у Джона проблемы.

    int hour - время в диапазоне от 0 до 23 часов
    boolean singing -поет/ не поет

    При решении можно использовать только логические операторы и операторы  сравнения
    static boolean johnInTrouble(boolean singing, int hour )

    johnInTrouble( true, 6) -> true
    johnInTrouble( true, 7) -> false
    johnInTrouble( false, 5) -> false

         */
/* mene Lösung
boolean singing = true;
int hour = 6;
boolean result = true;

            if (singing ==(hour>=0 && hour<= 7)){
                System.out.println("John  have a trouble " + result);
            }
            else {
                System.out.println("John is OK");
            }

        }


 */

        System.out.println(johnInTrouble( true, 6));
        System.out.println(johnInTrouble( true, 7));
        System.out.println(johnInTrouble( false, 5));

    }
    static boolean johnInTrouble(boolean singing, int hour ){
        return singing && (hour<7|| hour >20);
    }

    }

