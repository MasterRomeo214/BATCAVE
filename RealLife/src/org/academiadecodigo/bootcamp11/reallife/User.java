package org.academiadecodigo.bootcamp11.reallife;

/**
 * Created by codecadet on 22/09/17.
 */
public class User {

    Wallet wallet = new Wallet(1000, 250);
    PiggyBank piggyBank = new PiggyBank(5000, 3000);

    public String name;
    public double spentMoney;
    public double walletMoney;

    public User(String name, double spentMoney, double walletMoney) {
        this.name = name;
        this.spentMoney = spentMoney;
        this.walletMoney = walletMoney;
    }


    public double spendMoney(double spentMoney) {
        if (spentMoney > walletMoney) {
            System.out.println("You can't spend that much");

        }
        System.out.println("You spent " + spentMoney + " €");
        walletMoney = walletMoney - spentMoney;
        return walletMoney;
    }

    public double withdrawMoney(double walletMoney) {
        if (piggyBank.piggyMoney > wallet.maxWalletCapacity) {
            System.out.println("You cannot withdraw that much!");
        }
        walletMoney = walletMoney + piggyBank.piggyMoney;
        System.out.println("You have withdrawn " + piggyBank.piggyMoney + " €");
        return walletMoney;
    }

    public void depositMoney(double walletMoney) {
        if (piggyBank.maxPiggyCapacity > piggyBank.maxPiggyCapacity + walletMoney) {
            System.out.println("You cannot deposit that much amount of money!");
        }
        piggyBank.piggyMoney = piggyBank.piggyMoney + walletMoney;
        System.out.println("You have deposited " + walletMoney + " €");
    }

}


// spend
// withdraw
// deposit





















/*

    public double addWalletMoney(double money) {
        if (money > (maxCapacity - capacity)) {
            System.out.println("Cannot keep that much amount of money");
        }

        capacity = capacity + money;
        return capacity;
    }


    public double removeWalletMoney(double money) {
        if (money < capacity) {
            System.out.println("Cannot spend that amount of money");
        }

        capacity = capacity - money;
        return capacity;
    }

    public double getWalletCapacity() {
        System.out.println("The wallet has available :" + capacity);
        return capacity;
    } */
