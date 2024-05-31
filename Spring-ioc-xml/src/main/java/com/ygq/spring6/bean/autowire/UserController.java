package com.ygq.spring6.bean.autowire;

import com.ygq.spring6.bean.autowire.Service.UserService;

public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        System.out.println("Controller方法执行");
        userService.saveUser();
    }
}
