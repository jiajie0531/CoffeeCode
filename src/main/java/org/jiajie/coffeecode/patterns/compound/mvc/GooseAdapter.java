package org.jiajie.coffeecode.patterns.compound.mvc;

/**
 * 鹅-适配器
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    /**
     * 构造器需要传入要适配的鹅对象
     * @param goose     鹅对象
     */
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    /**
     * 当调用quack()时，会被委托到鹅的honk()方法
     */
    @Override
    public void quack() {
        goose.honk();
    }

}
