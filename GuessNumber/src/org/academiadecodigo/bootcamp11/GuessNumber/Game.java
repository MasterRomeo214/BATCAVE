package org.academiadecodigo.bootcamp11.GuessNumber;

public class Game {

    private int maxNumber;

    private Player[] players;

    public Game(int maxNumber, Player[] players) {

        this.maxNumber = NumberGenerator.getNumber(maxNumber);
        this.players = players;
    }

    public void start() {
        for (int i = 0; i < players.length; i++) {
            if (maxNumber == NumberGenerator.getNumber(maxNumber)) {

                System.out.println("You guessed it " + players[i].getName() + "!");
                break;
            }
            System.out.println("Not that one " + players[i].getName() + " ...");
            if (i == players.length - 1) {
                i = -1;
            }
        }
    }
}