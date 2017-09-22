package org.academiadecodigo.bootcamp11.calculator;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {

        Calculator chinese = new Calculator("Cazio", "Blue");

        //chinese.brand = "Cazio";
        //chinese.color = "Green";

        Calculator thai = new Calculator();


        Operation add = Operation.ADD;
        System.out.println(add.getSymbol());

        Operation sub = Operation.SUBTRACT;
        System.out.println(sub.getSymbol());

        Operation mult = Operation.MULTIPLY;
        System.out.println(mult.getSymbol());

        Operation div = Operation.DIVIDE;
        System.out.println(div.getSymbol());


        System.out.println(Operation.showOperations());

        chinese.doOperation(3,4, Operation.ADD);
        thai.doOperation(5,7,Operation.MULTIPLY);
        chinese.doOperation(4,3,Operation.SUBTRACT);
        thai.doOperation(234,15,Operation.DIVIDE);

        //thai.brand = "Sei lá";
        //thai.color = "Hot Pink";

        //System.out.println("Calc " + chinese.brand + " color " + chinese.color);
        //System.out.println("Calc " + thai.brand + " color " + thai.color);

        /*Calculator japa = new Calculator("Casio", "Red");
        japa.setColor("Yellow");

        String brand = japa.getBrand();
        String color = japa.getColor();

        System.out.println("The calculator brand is -> " + japa.getBrand());
        System.out.println("The calculator color is -> " + japa.getColor());

        int resultIntAdd = thai.add(2, 3);
        System.out.println("The sum is -> " + resultIntAdd);

        float resultFloatAdd = thai.add(1.2f, 2.2f);
        System.out.println("The sum is -> " + resultFloatAdd);

        int resultIntSub = thai.subtract(4, 2);
        System.out.println("The subtraction is -> " + resultIntSub);

        float resultFloatSub = thai.subtract(3.2f, 1.2f);
        System.out.println("Once again, the subtraction is -> " + resultFloatSub);

        int resultIntMult = thai.mult(2, 4);
        System.out.println("The resulting multiplication is -> " + resultIntMult);

        float resultFloatDivide = thai.divide(7.8f, 3.2f);
        System.out.println("And this result is -> " + resultFloatDivide);

        double resultDouble = japa.divideDouble(7.89, 1.56);
        System.out.println("At last, the result is -> " + resultDouble);

        double resultRest = japa.restDiv(3,2);
        System.out.println("The rest is -> "+resultRest);
*/
    }

}
