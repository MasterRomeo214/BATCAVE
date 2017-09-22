package org.academiadecodigo.bootcamp11.GuessNumber;

public class Main {

    public static void main(String[] args) {

        Player[] players = new Player[3];

        Player romeu = new Player("Romeu");
        Player julieta = new Player("Julieta");
        Player rodrigo = new Player("Rodrigo");

        players[0] = romeu;
        players[1] = julieta;
        players[2] = rodrigo;


        Game game = new Game(15, players);

        game.start();
    }
}
