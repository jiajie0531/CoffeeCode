package org.jiajie.coffeecode.patterns.compound.mvc;

/**
 * QuackObservable是一个接口。
 * 任何想被观察到Quackable都必须实现QuackObservable接口。
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
