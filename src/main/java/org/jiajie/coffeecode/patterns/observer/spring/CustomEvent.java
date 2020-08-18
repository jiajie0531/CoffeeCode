package org.jiajie.coffeecode.patterns.observer.spring;

import org.springframework.context.ApplicationEvent;

/**
 * @author jay
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "My Custom Event";
    }
}
