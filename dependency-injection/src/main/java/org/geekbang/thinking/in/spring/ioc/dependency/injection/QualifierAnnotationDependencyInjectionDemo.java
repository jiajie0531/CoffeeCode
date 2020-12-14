package org.geekbang.thinking.in.spring.ioc.dependency.injection;

import org.geekbang.thinking.in.spring.ioc.dependency.injection.annotation.UserGroup;
import org.geekbang.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;

/**
 * {@link org.springframework.beans.factory.annotation.Qualifier} 注解依赖注入
 *
 * @author jay
 */
@Configuration
public class QualifierAnnotationDependencyInjectionDemo {

    /**
     * superUser -> primary = true
     */
    @Autowired
    private User user;

    /**
     * 指定 Bean 名称或 ID
     */
    @Autowired
    @Qualifier("user")
    private User namedUser;

    /**
     * 2 Beans = user + superUser
     */
    @Autowired
    private Collection<User> allUsers;

    /**
     * 2 Beans = user1 + user2 -> 4 Beans = uesr1 + user2 + user3 + user4
     */
    @Autowired
    @Qualifier
    private Collection<User> qualifiedUsers;

    /**
     * 2 Beans = user3 + user4
     */
    @Autowired
    @UserGroup
    private Collection<User> groupedUsers;

    /**
     * 进行逻辑分组
     *
     * @return  user
     */
    @Bean
    @Qualifier
    public User user1() {
        return createUser(7L);
    }

    /**
     * 进行逻辑分组
     *
     * @return  user
     */
    @Bean
    @Qualifier
    public User user2() {
        return createUser(8L);
    }

    @Bean
    @UserGroup
    public User user3() {
        return createUser(9L);
    }

    @Bean
    @UserGroup
    public User user4() {
        return createUser(10L);
    }

    private static User createUser(long id) {
        User user = new User();
        user.setId(id);
        return user;
    }

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        // 注册 Configuration Class（配置类）-> Spring Bean
        applicationContext.register(QualifierAnnotationDependencyInjectionDemo.class);

        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(applicationContext);

        String xmlResource = "classpath:/META-INF/dependency-lookup-context.xml";

        // 加载 XML 资源，解析并且生成 BeanDefinition
        beanDefinitionReader.loadBeanDefinitions(xmlResource);

        // 启动 Spring 应用上下文
        applicationContext.refresh();

        // 依赖查找 QualifierAnnotationDependencyInjectionDemo Bean
        QualifierAnnotationDependencyInjectionDemo demo = applicationContext.getBean(QualifierAnnotationDependencyInjectionDemo.class);

        // 期待输出 superUser Bean
        System.out.println("demo.user = " + demo.user);

        // 期待输出 user Bean
        System.out.println("demo.namedUser = " + demo.namedUser);

        // 期待输出 superUser user user1 user2
        System.out.println("demo.allUsers = " + demo.allUsers);

        // 期待输出 user1 user2
        System.out.println("demo.qualifiedUsers = " + demo.qualifiedUsers);

        // 期待输出 user3 user4
        System.out.println("demo.groupedUsers = " + demo.groupedUsers);

        // 显示地关闭 Spring 应用上下文
        applicationContext.close();
    }
}
