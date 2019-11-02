package org.jiajie.coffeecode.patterns.state;

/**
 * class_name: State
 * package: org.jiajie.coffeecode.patterns.state
 * describe:  定义一个接口以封装与Context的一个特定状态相关的行为。
 * creat_user: jay.jia
 * creat_date: 2019/10/27
 * creat_time: 22:00
 **/
public interface State {
    /**
     * Method called by the Context
     */
    public void handle();
}
