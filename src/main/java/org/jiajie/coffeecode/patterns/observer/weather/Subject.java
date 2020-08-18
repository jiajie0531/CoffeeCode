package org.jiajie.coffeecode.patterns.observer.weather;

/**
 * @author jay
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
