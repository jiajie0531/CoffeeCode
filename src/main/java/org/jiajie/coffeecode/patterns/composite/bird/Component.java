package org.jiajie.coffeecode.patterns.composite.bird;

/**
 * @author jie
 * @date 2020/8/22 2:51 PM
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
