package org.geekbang.thinking.in.spring.ioc.dependency.injection;

import jdk.nashorn.internal.ir.Optimistic;
import org.geekbang.thinking.in.spring.ioc.dependency.injection.annotation.InjectedUser;
import org.geekbang.thinking.in.spring.ioc.dependency.injection.annotation.MyAutowired;
import org.geekbang.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import javax.inject.Inject;
import java.util.Map;
import java.util.Optional;

/**
 * 注解驱动的依赖注入处理过程
 *
 * @author jay
 */
@Configuration
public class AnnotationDependencyInjectionResolutionDemo {

    /**
     * 依赖查找（处理）+ 延迟
     */
    @Autowired
    @Lazy
    private User lazyUser;

    /**
     * 依赖查找（处理）
     * DependencyDescriptor ->
     * 必须（required = true）
     * 实时注入（eager = true）
     * 通过类型（User.class）
     * 字段名称（"user"）
     * 是否首要（primary = true）
     */
    @Autowired
    private User user;

    /**
     * 集合类型依赖注入
     *
     * user superUser
     */
    @Autowired
    private Map<String, User> users;

    /**
     * superUser
     */
    @MyAutowired
    private Optional<User> userOptional;

    @Inject
    private User injectedUser;

    @InjectedUser
    private User myInjectedUser;

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        // 注册 Configuration Class(配置类) -> Spring Bean
        applicationContext.register(AnnotationDependencyInjectionResolutionDemo.class);

        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(applicationContext);

        String xmlResourcePath = "classpath:/META-INF/dependency-lookup-context.xml";

        // 加载 XML 资源，解析并且生成 BeanDefinition
        beanDefinitionReader.loadBeanDefinitions(xmlResourcePath);

        // 启动 Spring 应用上下文
        applicationContext.refresh();

        // 依赖查找 AnnotationDependencyInjectionResolutionDemo Bean
        AnnotationDependencyInjectionResolutionDemo demo = applicationContext.getBean(AnnotationDependencyInjectionResolutionDemo.class);

        // 期待输出 superUser Bean
        System.out.println("demo.user = " + demo.user);
        System.out.println("demo.injectedUser = " + demo.injectedUser);

        // 期待输出 user superUser
        System.out.println("demo.users = " + demo.users);

        // 期待输出 superUser Bean
        System.out.println("demo.userOptional = " + demo.userOptional);

        // 期待输出 superUser Bean
        System.out.println("demo.myInjectedUser = " + demo.myInjectedUser);

        // 显示地关闭 Spring 应用上下文
        applicationContext.close();

    }
}
