package org.jiajie.coffeecode.patterns.compound.mvc;

/**
 * QuackCounter是一个装饰者。
 * 给鸭子一些新行为（计算次数的行为）
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks(){
        return numberOfQuacks;
    }
}
