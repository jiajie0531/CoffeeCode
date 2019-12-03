package org.jiajie.coffeecode.patterns.compound.mvc;

/**
 * class_name: DuckSimulator
 * package: org.jiajie.coffeecode.patterns.compound.mvc
 * describe: 鸭子模拟器
 * @author  jay.jia
 * creat_date: 2019/12/2
 * creat_time: 16:56
 **/
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate(){
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));

        System.out.println("\nDuck Simulator: With Decorator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
