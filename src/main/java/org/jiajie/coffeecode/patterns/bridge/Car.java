package org.jiajie.coffeecode.patterns.bridge;

/**
 * @author jay
 */
public abstract class Car {
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
