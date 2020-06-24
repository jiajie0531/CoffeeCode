package org.jiajie.coffeecode.concurrent.producer;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 有一个处理String类型实例的ArrayBlockingQueue类。
 *
 * @author jay
 */
public class Table extends ArrayBlockingQueue<String> {

    public Table(int count) {
        super(count);
    }

    @Override
    public void put(String cake) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " puts " + cake);
        super.put(cake);
    }

    @Override
    public String take() throws InterruptedException {
        String cake = super.take();
        System.out.println(Thread.currentThread().getName() + " takes " + cake);
        return cake;
    }
}
