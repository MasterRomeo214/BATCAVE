package org.academiadecodigo.bootcamp11.calculator;

/**
 * Created by codecadet on 18/09/17.
 */
public class Calculator {

    private String brand;
    private String color;

    private int result;

    public Calculator() {
        brand = "Texas";
        color = "black";
    }

    public Calculator(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    //getter
    public String getBrand() {
        return this.brand;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public String getColor() {

        return this.color;
    }


    public void doOperation(int num1, int num2, Operation doOperation) {


        switch (doOperation) {


            case ADD:

                result = num1 + num2;
                System.out.println(num1 + doOperation.getSymbol() + num2 + (" = " + result));
                break;

            case SUBTRACT:

                result = num1 - num2;
                System.out.println(num1 + doOperation.getSymbol() + num2 + (" = " + result));
                break;

            case MULTIPLY:

                result = num1 * num2;
                System.out.println(num1 + doOperation.getSymbol() + num2 + (" = " + result));
                break;

            case DIVIDE:

                result = num1 / num2;
                System.out.println(num1 + doOperation.getSymbol() + num2 + (" = " + result));
                break;

        }

    }


   /* public int add(int number1, int number2) {
        /*
        add 2 int nums
        number1 = 4;
        number2 = 2;
        *
        return number1 + number2;
    }

    public float add(float number1, float number2) {
        //add 2 float nums
        /*
        number1= value
        number2 = value 2
         *
        return number1 + number2;
    }

    public int subtract(int number1, int number2) {
        //subtract 2 int nums
        return number1 - number2;

    }

    public float subtract(float number1, float number2) {
        //subtract 2 float nums

        return number1 - number2;
    }

    public int mult(int number1, int number2) {

        return number1 * number2;

    }

    public float divide(float number1, float number2) {

        return number1 / number2;
    }

    public double divideDouble(double number1, double number2) {

        return number1 / number2;
    }

    public double restDiv(double number1, double number2) {

        return number1 % number2;
    }*/
}
