package org.jiajie.coffeecode.concurrent.single;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * 资源个数有限
 *
 * @author jay
 */
public class BoundedResource {
    private final Semaphore semaphore;
    private final int permits;
    private final static Random random = new Random(314159);

    public BoundedResource(int permits) {
        this.semaphore = new Semaphore(permits);
        this.permits = permits;
    }

    public void use() throws InterruptedException {
        semaphore.acquire();
        try{
            doUse();
        } finally {
            semaphore.release();
        }
    }

    // 实际使用资源（此处仅使用 Thread.sleep）
    private void doUse() throws InterruptedException {
        Log.println("BEGIN: used = " + (permits - semaphore.availablePermits()));
        Thread.sleep(random.nextInt(500));
        Log.println("END: used = " + (permits - semaphore.availablePermits()));
    }
}
