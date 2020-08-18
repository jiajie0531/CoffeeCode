package org.jiajie.coffeecode.patterns.chain;

import java.math.BigDecimal;

/**
 * @author jie
 * @date 2020/8/15 7:32 AM
 */
public class Request {
    private String name;
    private BigDecimal amount;

    public Request(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
