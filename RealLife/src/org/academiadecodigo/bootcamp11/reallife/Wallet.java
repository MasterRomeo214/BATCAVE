package org.academiadecodigo.bootcamp11.reallife;

/**
 * Created by codecadet on 22/09/17.
 */
public class Wallet {

    public int maxWalletCapacity;
    public double walletMoney;

    public Wallet(int maxWalletCapacity, double walletMoney) {
        this.maxWalletCapacity = maxWalletCapacity;
        this.walletMoney = walletMoney;

    }

    public double addWalletMoney(double money) {
        if (money > (maxWalletCapacity - walletMoney)) {
            System.out.println("Cannot keep that much amount of money");
        }

        walletMoney = walletMoney + money;
        return walletMoney;
    }


    public double removeWalletMoney(double money) {
        if (money < walletMoney) {
            System.out.println("Cannot spend that amount of money");
        }

        walletMoney = walletMoney - money;
        return walletMoney;
    }

    public double getWalletCapacity() {
        System.out.println("The wallet has available :" + walletMoney);
        return walletMoney;
    }


}
