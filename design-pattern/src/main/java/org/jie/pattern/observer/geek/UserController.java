package org.jie.pattern.observer.geek;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jay
 */
public class UserController {
    // 依赖注入
    private UserService userService;
    private List<RegObserver> regObservers = new ArrayList<>();

    /**
     * 一次性设置好，之后也不可能动态的修改
     *
     * @param regObservers  需要注册的观察者
     */
    public void setRegObservers(List<RegObserver> regObservers) {
        regObservers.addAll(regObservers);
    }

    public Long register(String telephone, String password) {
        // 省略输入参数的校验代码
        // 省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);

        for (RegObserver observer : regObservers) {
            observer.handleRegSuccess(userId);
        }

        return userId;
    }
}
