package org.academiadecodigo.bootcamp11.rockpaperscissor;

public class Game {

    private int roundP1;
    private int roundP2;
    private Player playerOne;
    private Player playerTwo;


    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {


        boolean gameFinished = false;

        while (gameFinished != true) {

            if (playerOne.getHandGame() == Hand.ROCK) {
                if (playerTwo.getHandGame() == Hand.PAPER) {
                    System.out.println(playerTwo.getName() + " Wins!");
                    roundP2++;

                    if (roundP2 == 3) {
                        gameFinished = true;
                        break;
                    }
                }
                System.out.println(playerOne.getName() + " Wins!");
                roundP1++;

                if (roundP1 == 3) {
                    gameFinished = true;
                    break;
                }

            } else if (playerOne.getHandGame() == Hand.PAPER) {
                if (playerTwo.getHandGame() == Hand.SCISSORS) {
                    System.out.println(playerTwo.getName() + " Wins!");
                    roundP2++;

                    if (roundP2 == 3) {
                        gameFinished = true;
                        break;
                    }
                }
                System.out.println(playerOne.getName() + " Wins!");
                roundP1++;

                if (roundP1 == 3) {
                    gameFinished = true;
                    break;
                }
            } else if (playerOne.getHandGame() == Hand.SCISSORS) {
                if (playerTwo.getHandGame() == Hand.ROCK) {
                    System.out.println(playerTwo.getName() + " Wins!");
                    roundP2++;

                    if (roundP2 == 3) {
                        gameFinished = true;
                        break;
                    }
                }
                System.out.println(playerOne.getName() + " Wins!");
                roundP1++;

                if (roundP1 == 3) {
                    gameFinished = true;
                    break;
                }
            }
            System.out.println("Draw!");
        }
    }
}



/*


 ROCK 0 OWNS SCISSORS 2
 PAPER 1 OWNS ROCK 0
 SCISSORS 2 OWNS PAPER 1

 */