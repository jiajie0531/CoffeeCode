package org.jiajie.coffeecode.jjvms;

public class CronTest2 {
    public void foo(Object lock) {
        synchronized (lock) {
            lock.hashCode();
        }
    }
}
