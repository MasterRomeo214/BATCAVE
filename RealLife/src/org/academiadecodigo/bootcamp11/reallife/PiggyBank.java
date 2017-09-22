package org.academiadecodigo.bootcamp11.reallife;

public class PiggyBank {

    public int maxPiggyCapacity;
    public double piggyMoney;

    public PiggyBank(int maxPiggyCapacity, double piggyMoney) {
        this.maxPiggyCapacity = maxPiggyCapacity;
        this.piggyMoney = piggyMoney;

    }

    public double addPiggyMoney(double money) {
        if (money > (maxPiggyCapacity - piggyMoney)) {
            System.out.println("Not a possible transaction.");
        }

        piggyMoney = piggyMoney + money;
        return piggyMoney;
    }

    public double removePiggyMoney(double money) {
        if (money > piggyMoney) {
            System.out.println("Not possible to withdraw such amount.");
        }

        piggyMoney = piggyMoney - money;
        return piggyMoney;
    }

    public double getPiggyCapacity() {
        System.out.println("Piggybank has : " + piggyMoney);
        return piggyMoney;
    }

}

