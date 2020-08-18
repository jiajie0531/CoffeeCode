package org.jiajie.coffeecode.patterns.chain;

/**
 * @author jie
 * @date 2020/8/15 7:33 AM
 */
public interface Handler {
    // 返回Boolean.TRUE = 成功
    // 返回Boolean.FALSE = 拒绝
    // 返回null = 交下一个处理
    Boolean process(Request request);
}
