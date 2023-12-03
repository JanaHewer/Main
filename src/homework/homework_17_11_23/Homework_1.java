package homework.homework_17_11_23;

public class Homework_1 {
    public static void main(String[] args) {

        /* Написать метод, определяющий является ли целое число положительным,
        отрицательным или нулем. Метод принимает целое число в качестве параметра и
        возвращает соответствующую строку. В методе main вывести результат на экран

         */

        // спользую математическую функцию signum:

      /*  int secondNumber = -125;
        int result = checkNumber(secondNumber);

        if (result == 0)
            System.out.print(secondNumber + " is Zero");
        else if (result == 1)
            System.out.print(secondNumber + " is Positive");
        else
            System.out.print(secondNumber + " is Negative");

    static int checkNumber(int x)
    {
        int ans = Integer.signum(x);
        return ans;
    }
}
       */

        double Number = 1;
        System.out.println(Number + " is" + checkTheNumber(Number));

    }

    static String checkTheNumber(double x) {
        if (x > 0)
            return " Positive";

        else if (x < 0)
            return " Negative";

        else
            return " Zero";

    }
}

