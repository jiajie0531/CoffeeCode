package org.jiajie.coffeecode.concurrent;


import net.jcip.annotations.Immutable;

import java.util.LinkedList;
import java.util.List;

/**
 * 用于谜题解决框架的链表节点
 *
 * @author jay
 * @param <P>   位置类
 * @param <M>   移动类
 */
@Immutable
public class Node<P, M> {
    final P pos;
    final M move;
    final Node<P, M> prev;

    public Node(P pos, M move, Node<P, M> prev) {
        this.pos = pos;
        this.move = move;
        this.prev = prev;
    }

    List<M> asMoveList(){
        List<M> solution = new LinkedList<M>();
        for (Node<P, M> n = this; n.move != null; n = n.prev) {
            solution.add(0, n.move);
        }
        return solution;
    }
}
