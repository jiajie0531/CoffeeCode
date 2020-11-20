package org.geekbang.thinking.in.spring.questions;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1226. 哲学家进餐
 *
 * @author jay
 */
public class DiningPhilosophers {
    private final ReentrantLock[] lockList = {new ReentrantLock(), new ReentrantLock(), new ReentrantLock(), new ReentrantLock(), new ReentrantLock()};
    /**
     * 最多只有4个哲学家去持有叉子
     */
    Semaphore eatLimit = new Semaphore(4);

    public DiningPhilosophers() {

    }


    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        int leftFork = (philosopher + 1) % 5;
        int rightFork = philosopher;

        eatLimit.acquire();

        lockList[leftFork].lock();
        lockList[rightFork].lock();
        pickLeftFork.run();
        pickRightFork.run();

        eat.run();

        putLeftFork.run();
        putRightFork.run();
        lockList[leftFork].unlock();
        lockList[rightFork].unlock();


        eatLimit.release();
    }
}
