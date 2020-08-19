package org.jiajie.coffeecode.patterns.observer.java;

/**
 * @author jay
 */
public interface Observer {
    public void update();
    public void setSubject(Subject sub);
}
