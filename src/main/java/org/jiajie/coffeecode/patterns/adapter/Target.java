package org.jiajie.coffeecode.patterns.adapter;

/**
 * @author jie
 * @date 2020/8/8 9:48 AM
 */
public abstract class Target {
    public void request(){
        System.out.println("common request!");
    }
}
