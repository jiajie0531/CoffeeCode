package org.jiajie.coffeecode.patterns.compound.mvc;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    /**
     * 用add()方法新增Quackable对象到Flock。
     */
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    /**
     * 毕竟Flock也是Quackable，所以也要具备quack()方法，
     * 此方法会对整群产生作用，
     * 我们遍历ArrayList调用每一个元素上到quack()。
     */
    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
        }
    }
}
