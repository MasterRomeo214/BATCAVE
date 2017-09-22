package org.academiadecodigo.bootcamp11.GuessNumber;

public class Player {

    private String name;
    private int maxNumber;

    public Player() {
        name = "AAA";
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int guessNumber(int max) {
        this.maxNumber = NumberGenerator.getNumber(maxNumber);
        return maxNumber;
    }
}
