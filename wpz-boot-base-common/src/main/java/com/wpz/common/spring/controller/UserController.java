package com.wpz.common.spring.controller;

import com.wpz.common.spring.annotation.MyAutowired;
import com.wpz.common.spring.service.UserService;

public class UserController {

    @MyAutowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
