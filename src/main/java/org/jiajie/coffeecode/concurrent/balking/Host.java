package org.jiajie.coffeecode.concurrent.balking;

import java.util.concurrent.TimeoutException;

/**
 * 带有超时的Host类
 *
 * @author jay
 */
public class Host {
    /* 超时时间 */
    private final long timeout;

    /* 方法正常执行时值为true */
    private boolean ready = false;

    public Host(long timeout) {
        this.timeout = timeout;
    }

    public synchronized void setExecutable(boolean on) {
        ready = on;
        notifyAll();
    }

    public synchronized void execute() throws TimeoutException, InterruptedException {
        long start = System.currentTimeMillis();    // 开始时间
        while (!ready){
            long now = System.currentTimeMillis();  // 当前时间
            long rest = timeout - (now - start);    // 剩余的等待时间
            if (rest <= 0){
                throw new TimeoutException("now - start = " + (now - start) + ", timeout = " + timeout);
            }
            wait(rest);
        }
        doExecute();
    }

    /**
     * 实际的处理
     */
    private void doExecute() {
        System.out.println(Thread.currentThread().getName() + " calls doExecute");
    }
}
