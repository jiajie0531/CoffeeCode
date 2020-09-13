package org.jiajie.coffeecode.patterns.composite.bird;

import org.jiajie.coffeecode.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jie
 * @date 2020/8/22 3:06 PM
 */
public class Composite extends Component {
    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        // 显示其枝节点名称，并对其下级进行遍历
        System.out.println(StringUtil.repeatableString("-", depth) + this.name);
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
