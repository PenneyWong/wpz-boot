package com.wpz.common.spring;

import com.wpz.common.spring.controller.UserController;
import com.wpz.common.spring.service.UserService;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

public class MyTest {

    @Test
    public void test() throws Exception {

        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();

        UserService userService = new UserService();
        System.out.println(userService);

        Field serviceField = clazz.getDeclaredField("userService");
        serviceField.setAccessible(true);

        String name  = serviceField.getName();
        name  = name.substring(0,1).toUpperCase()+name.substring(1,name.length());
        String setMethodName = "set" + name;

        Method method = clazz.getDeclaredMethod(setMethodName, UserService.class);
        method.invoke(userController,userService);

        System.out.println(userController.getUserService());
    }
}
