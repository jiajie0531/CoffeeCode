package org.jiajie.coffeecode.concurrent.rwlock;

public class ReaderThread extends Thread {
    private final Data data;

    public ReaderThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            while (true) {
                char[] readbuf = new char[0];
                readbuf = data.read();
                System.out.println(Thread.currentThread().getName() + "reads " + String.valueOf(readbuf));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
