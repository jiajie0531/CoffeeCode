package org.geekbang.thinking.in.spring.questions;

import java.util.concurrent.Semaphore;

public class H2O {

    Semaphore hydrogenSp = new Semaphore(2);
    Semaphore oxygenSp = new Semaphore(0);

    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hydrogenSp.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        oxygenSp.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oxygenSp.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        hydrogenSp.release(2);
    }
}
