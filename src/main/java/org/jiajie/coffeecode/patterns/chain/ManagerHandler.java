package org.jiajie.coffeecode.patterns.chain;

import java.math.BigDecimal;

/**
 * @author jie
 * @date 2020/8/15 7:34 AM
 */
public class ManagerHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        // 如果超过1000元，处理不了，交下一个处理:
        if (request.getAmount().compareTo(BigDecimal.valueOf(1000)) > 0) {
            return null;
        }
        // 对Bob有偏见:
        return !request.getName().equalsIgnoreCase("bob");
    }
}
