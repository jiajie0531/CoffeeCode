package org.geekbang.thinking.in.spring.bean.factory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 默认 {@link UserFactory} 实现
 *
 * @author jay
 */
public class DefaultUserFactory implements UserFactory, InitializingBean, DisposableBean {

    public void initUserFactory(){
        System.out.println("自定义初始化方法 initUserFactory() : UserFactory 初始化中...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void destroy() throws Exception {

    }

    public void doDestroy(){
        System.out.println("自定义销毁方法 doDestroy() : UserFactory 销毁中...");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("当前 DefaultUserFactory 对象正在被垃圾回收...");
    }
}
