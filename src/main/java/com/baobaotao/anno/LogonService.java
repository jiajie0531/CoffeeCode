package com.baobaotao.anno;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author jay
 */
@Service
public class LogonService implements BeanNameAware {
    @Autowired(required = false)
    private LogDao logDao;
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public LogDao getLogDao() {
        return logDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("beanName: " + beanName);
    }

    public void initMethod1(){
        System.out.println("initMethod1");
    }

    public void initMethod2(){
        System.out.println("initMethod2");
    }
}
