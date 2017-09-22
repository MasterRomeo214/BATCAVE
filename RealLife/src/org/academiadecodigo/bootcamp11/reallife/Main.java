package org.academiadecodigo.bootcamp11.reallife;

/**
 * Created by codecadet on 22/09/17.
 */
public class Main {

    public static void main(String[] args) {

        //PiggyBank piggyBank = new PiggyBank(5000, 3000);
        // Wallet wallet = new Wallet(1000, 250);
        User user = new User("Romeu",345,956);

        user.depositMoney(500);
        user.spendMoney(900);
        user.withdrawMoney(10);


    }
}
