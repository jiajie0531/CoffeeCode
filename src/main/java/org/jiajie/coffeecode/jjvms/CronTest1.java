package org.jiajie.coffeecode.jjvms;

public class CronTest1 {
    public synchronized void foo(Object lock) {
        lock.hashCode();
    }
}
