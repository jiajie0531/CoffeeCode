package org.jiajie.coffeecode.patterns.adapter;

/**
 * @author jie
 * @date 2020/8/8 9:53 AM
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
