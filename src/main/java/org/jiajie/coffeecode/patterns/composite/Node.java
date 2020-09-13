package org.jiajie.coffeecode.patterns.composite;

import java.util.List;

/**
 * @author jie
 * @date 2020/8/22 2:16 PM
 */
public interface Node {

    /**
     * 添加一个节点为子节点；
     *
     * @param node  节点
     * @return      节点
     */
    Node add(Node node);

    /**
     * 获取子节点
     *
     * @return  子节点
     */
    List<Node> children();

    /**
     * 输出为XML
     *
     * @return  XML
     */
    String toXml();
}
