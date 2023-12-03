package homework;

public class Homework_6 {

    /* Задача 1

Написать метод, считающий площадь круга и возвращающий это
значение в основную программу. Формула для расчета площади
area = pi* radius * radius
Значение радиуса должно передаваться как аргумент метода.
Затем, в методе main вывести полученное значение на экран

    Задача 1
     */
    public static void main(String[] args) {




double result = circle(25);
        System.out.println("The area of the circle = " + result);
double resultC = celsius(56);

        System.out.println("convert Fahrenheit to Celsius = " + celsius(56));

    }
        static double circle(double radius){

        //radius = 25; - falsch
        double area = (radius * radius) * Math.PI;
            //System.out.println("The area of the circle = " + area);

            return area;


    }
    /*
    Задача 2

Написать метод, конвертирующий температуру из градусов Фаренгейта в
градусы Цельсия по формуле С = 5*(F-32)/9. Значение градусов Фаренгейта
должно передаваться как аргумент метода.
Метод должен возвращать полученное значение в основную программу.
Затем, в методе main вывести полученное значение на экран.
     */

    static double celsius (double fahrenheit){
// fahrenheit = 56; - falsch

double celsius = 5*(fahrenheit-32)/9;
       // System.out.println("convert Fahrenheit to Celsius = " + celsius);

       return celsius;


    }

}
