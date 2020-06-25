package org.jiajie.coffeecode.concurrent.rwlock;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(10);
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new WriterThread(data, "ABCDEFGHIJKLIMNOPQRSTUVWXYZ").start();
        new WriterThread(data, "abcdefghijklimnopqrstuvwxyz").start();
    }
}
