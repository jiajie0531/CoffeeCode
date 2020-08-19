package org.jiajie.coffeecode.patterns.observer.spring.smart;

import org.springframework.context.ApplicationEvent;

/**
 * @author jay
 */
public class ConfigRefreshEvent extends ApplicationEvent {

    public ConfigRefreshEvent(final String content) {
        super(content);
    }
}
