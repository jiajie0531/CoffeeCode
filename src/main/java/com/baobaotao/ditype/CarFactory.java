package com.baobaotao.ditype;

/**
 * @author jay
 */
public class CarFactory {

    public Car createHongQiCar(){
        Car car = new Car();
        car.setBand("红旗CA72");
        return car;
    }

    public static Car createCar(){
        Car car = new Car();
        return car;
    }
}
