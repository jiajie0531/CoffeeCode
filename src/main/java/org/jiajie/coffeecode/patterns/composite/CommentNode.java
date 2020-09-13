package org.jiajie.coffeecode.patterns.composite;

import java.util.Collections;
import java.util.List;

/**
 * @author jie
 * @date 2020/8/22 2:38 PM
 */
public class CommentNode implements Node {
    private String text;

    public CommentNode(String text) {
        this.text = text;
    }

    @Override
    public Node add(Node node) {
        return (Node) new UnsupportedOperationException();
    }

    @Override
    public List<Node> children() {
        return Collections.emptyList();
    }

    @Override
    public String toXml() {
        return "<!-- " + text + " -->";
    }
}
