package org.jiajie.coffeecode.patterns.composite.bird;

import org.jiajie.coffeecode.util.StringUtil;

/**
 * @author jie
 * @date 2020/8/22 2:56 PM
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        // 通过“-”的数目显示级别
        System.out.println(StringUtil.repeatableString("-", depth) + this.name);
    }
}
