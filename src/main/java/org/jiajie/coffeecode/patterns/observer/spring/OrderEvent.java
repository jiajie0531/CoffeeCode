package org.jiajie.coffeecode.patterns.observer.spring;

import org.springframework.context.ApplicationEvent;

/**
 * 定义订单事件
 *
 * @author jay
 */
public class OrderEvent extends ApplicationEvent {

    private String message;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
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
