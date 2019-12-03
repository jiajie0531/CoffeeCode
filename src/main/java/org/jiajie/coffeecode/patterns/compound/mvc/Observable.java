package org.jiajie.coffeecode.patterns.compound.mvc;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Observable必须实现QuackObservable，
 * 因为它们具有一组相同都方法，QuackObservable会将这些方法的调用转给Observable的方法。
 */
public class Observable implements QuackObservable {

    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer)iterator.next();
            observer.update(duck);
        }
    }
}
