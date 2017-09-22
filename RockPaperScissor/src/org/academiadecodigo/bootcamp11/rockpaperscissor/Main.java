package org.academiadecodigo.bootcamp11.rockpaperscissor;

public class Main {

    public static void main(String[] args) {


        Player playerOne = new Player("Romeu");
        Player playerTwo = new Player("Julieta");

        Game game = new Game(playerOne, playerTwo);
        game.start();

    }
}
