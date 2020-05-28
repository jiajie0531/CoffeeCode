package org.jiajie.coffeecode.concurrent.single;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.print("Nice!");
        }
    }
}
