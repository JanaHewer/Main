package homework.homework_11_12_23;


import jdk.dynalink.Operation;

public class Calculator {

    public double num;
    public double num2;
    public double num3;

    public Calculator() {

        this.num = num;
        this.num2 = num2;
        this.num3 = num3;
    }


    public double add(double num, double num2) {
        return num + num2;

    }

    public double add(double num, double num2, double num3) {
        return num + num2 + num3;
    }

    public double subtract(double num, double num2) {
        return num - num2;
    }

    public double subtract(double num, double num2, double num3) {
        return num - num2 - num3;
    }

}