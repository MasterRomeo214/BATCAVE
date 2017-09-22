package org.academiadecodigo.bootcamp11.calculator;

/**
 * Created by codecadet on 21/09/17.
 */
public enum Operation {

    ADD(" + "),
    SUBTRACT(" - "),
    MULTIPLY(" x "),
    DIVIDE(" / ");

    private String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol(){
        return this.symbol;

    }

    public static String showOperations() {
        String result = "Operations -> ";

        for (Operation operation : Operation.values()) {
            result += operation.symbol + " ";

        }
        return result;

    }
}
