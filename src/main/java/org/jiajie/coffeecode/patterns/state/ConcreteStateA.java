package org.jiajie.coffeecode.patterns.state;

/**
 * class_name: ConcreteStateA
 * package: org.jiajie.coffeecode.patterns.state
 * describe: 每一子类实现一个与Context的一个状态相关的行为。
 * creat_user: jay.jia
 * creat_date: 2019/10/27
 * creat_time: 22:01
 **/
public class ConcreteStateA implements State {

    @Override
    public void handle() {
        System.out.println( "ConcreteStateA.handle()" );
    }
}
