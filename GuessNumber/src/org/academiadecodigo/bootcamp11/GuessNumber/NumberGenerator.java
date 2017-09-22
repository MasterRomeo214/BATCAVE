package org.academiadecodigo.bootcamp11.GuessNumber;

public class NumberGenerator {

    public static int getNumber(double maxNumber) {

        int randomNum = 0 + (int) (Math.random() * ((maxNumber - 0) + 1));
        maxNumber = randomNum;
        return (int) maxNumber;
    }
}