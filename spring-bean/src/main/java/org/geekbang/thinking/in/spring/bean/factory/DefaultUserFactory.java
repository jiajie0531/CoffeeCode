package org.geekbang.thinking.in.spring.bean.factory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 默认 {@link UserFactory} 实现
 *
 * @author jay
 */
public class DefaultUserFactory implements UserFactory, InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void destroy() throws Exception {

    }
}
