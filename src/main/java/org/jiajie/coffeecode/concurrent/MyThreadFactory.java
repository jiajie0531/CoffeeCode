package org.jiajie.coffeecode.concurrent;

import java.util.concurrent.ThreadFactory;

/**
 * 自定义的线程工厂
 * @author jay
 */
public class MyThreadFactory implements ThreadFactory {

    private final String poolName;

    public MyThreadFactory(String poolName) {
        this.poolName = poolName;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        return new MyAppThread(runnable, poolName);
    }
}
