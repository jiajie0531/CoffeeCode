package org.jiajie.coffeecode.patterns.observer.weather;

/**
 * @author jay
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
