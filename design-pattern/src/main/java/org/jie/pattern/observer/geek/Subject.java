package org.jie.pattern.observer.geek;

/**
 * @author jay
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);
}
