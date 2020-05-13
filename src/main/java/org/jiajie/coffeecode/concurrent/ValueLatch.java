package org.jiajie.coffeecode.concurrent;


import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.CountDownLatch;

/**
 * ValueLatch
 * <p/>
 * Result-bearing latch used by ConcurrentPuzzleSolver
 *
 * @author Brian Goetz and Tim Peierls
 */
@ThreadSafe
public class ValueLatch <T> {
    @GuardedBy("this") private T value = null;
    private final CountDownLatch done = new CountDownLatch(1);

    public boolean isSet() {
        return (done.getCount() == 0);
    }

    /**
     * ValueLatch提供了一种方式来保存这个值，只有第一次调用才会设置它。
     *
     * @param newValue  T
     */
    public synchronized void setValue(T newValue) {
        if (!isSet()) {
            value = newValue;
            // 在第一次调用setValue时，将更新解答方案，
            // 并且CountDownLatch会递减，从getValue中释放主线程。
            done.countDown();
        }
    }

    public T getValue() throws InterruptedException {
        done.await();
        synchronized (this) {
            return value;
        }
    }
}
