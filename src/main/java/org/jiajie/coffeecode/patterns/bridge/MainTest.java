package org.jiajie.coffeecode.patterns.bridge;

public class MainTest {
    public static void main(String[] args) {
        RefinedCar car = new BossCar(new HybridEngine());
        car.drive();
    }
}
