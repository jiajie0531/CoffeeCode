package org.jiajie.coffeecode.patterns.adapter;

/**
 * @author jie
 * @date 2020/8/8 9:56 AM
 */
public class Main {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
