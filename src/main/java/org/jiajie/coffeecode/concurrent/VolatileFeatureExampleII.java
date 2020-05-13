package org.jiajie.coffeecode.concurrent;

public class VolatileFeatureExampleII {

    volatile long vl = 0L;  // 使用 volatile 声明64位的long型变量

    public synchronized void set(long l) {
        vl = l;     // 单个 volatile 变量的写，用一个锁同步
    }

    public void getAndIncrement(){      // 普通方法调用
        long temp = get();              // 调用已同步的读方法
        temp += 1L;                     // 普通写操作
        set(temp);                      // 调用已同步的写方法
    }

    public synchronized long get() {
        return vl;  // 单个 volatile 变量的读，用一个锁同步
    }
}
