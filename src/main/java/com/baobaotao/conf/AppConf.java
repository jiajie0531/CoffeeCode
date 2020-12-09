package com.baobaotao.conf;

import com.baobaotao.anno.LogDao;
import com.baobaotao.anno.LogonService;
import com.baobaotao.anno.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jay
 */
@Configuration
public class AppConf {

    @Bean
    public UserDao userDao(){
        return new UserDao();
    }

    @Bean
    public LogDao logDao(){
        return new LogDao();
    }

//    @Bean
//    public LogonService logonService(){
//        LogonService logonService = new LogonService();
//        logonService.setLogDao(logDao());
//        logonService.setUserDao(userDao());
//        return logonService;
//    }
}
