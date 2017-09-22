package org.academiadecodigo.bootcamp11.rockpaperscissor;

public class Player {

    private String player;
    private int wins;
    private Hand handNumber;

    public Player(String player) {
        this.player = player;
    }

    public String getName() {
        return this.player;
    }

    public Hand getHandGame() {

        //todas as possibilidades
        //gerar numero random
        //aceder a possibilidade nessa posiçao

        int number = 2;
        int playingHand = (int) (Math.random() * ((number - 0) + 1));
        handNumber = Hand.values()[playingHand];
        return handNumber;
    }

}
