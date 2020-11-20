package org.geekbang.thinking.in.spring.questions;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * 1195. 交替打印字符串
 *
 * @author jay
 */
public class FizzBuzz {
    private int n;

    Semaphore s3 = new Semaphore(0);
    Semaphore s5 = new Semaphore(0);
    Semaphore s35 = new Semaphore(0);
    Semaphore s0 = new Semaphore(1);

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for (int i = 3; i <= n; i += 3) {
            if (i % 5 != 0) {
                s3.acquire();
                printFizz.run();
                s0.release();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 5; i <= n; i += 5) {
            if (i % 3 != 0) {
                s5.acquire();
                printBuzz.run();
                s0.release();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 15; i <= n; i += 15) {
            s35.acquire();
            printFizzBuzz.run();
            s0.release();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            s0.acquire();
            if (i % 3 == 0 && i % 5 == 0) {
                s35.release();
            } else if (i % 3 == 0) {
                s3.release();
            } else if (i % 5 == 0) {
                s5.release();
            } else {
                printNumber.accept(i);
                s0.release();
            }
        }
    }
}
