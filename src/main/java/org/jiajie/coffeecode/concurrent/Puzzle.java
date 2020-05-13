package org.jiajie.coffeecode.concurrent;

import java.util.Set;

/**
 * 谜题
 * 表示"搬箱子"之类谜题的抽象类
 *
 * @author jay
 * @param <P>   位置类
 * @param <M>   移动类
 */
public interface Puzzle<P, M> {
    /**
     * 一个初始位置
     *
     * @return  初始位置
     */
    P initialPosition();

    /**
     * 一个目标位置
     *
     * @param position  位置类
     * @return  目标位置
     */
    boolean isGoal(P position);

    /**
     * 计算从指定位置开始的所有合法移动
     *
     * @param position  位置类
     * @return  所有合法移动
     */
    Set<M> legalMoves(P position);

    /**
     * 每次移动的结果位置
     *
     * @param position  位置类
     * @param move      移动类
     * @return  结果位置
     */
    P move(P position, M move);
}
