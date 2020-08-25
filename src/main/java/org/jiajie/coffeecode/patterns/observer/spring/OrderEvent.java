package org.jiajie.coffeecode.patterns.observer.spring;

import org.springframework.context.ApplicationEvent;

/**
 * 定义订单事件
 *
 * @author jay
 */
public class OrderEvent extends ApplicationEvent {

    private String message;

    public OrderEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
