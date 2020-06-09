package org.jiajie.coffeecode.concurrent.single;

public class Bank {
    private int money;
    private String name;

    public Bank(int money, String name) {
        this.money = money;
        this.name = name;
    }

    // 存款
    public synchronized void deposit(int m){
        money += m;
    }

    // 取款
    public synchronized boolean withdraw(int m){
        if (money >= m){
            money -= m;
            return true;    // 取款成功
        } else {
            return false;   // 余额不足
        }
    }

    public String getName() {
        return name;
    }
}
