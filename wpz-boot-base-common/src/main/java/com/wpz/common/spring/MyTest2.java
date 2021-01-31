package com.wpz.common.spring;

import com.wpz.common.spring.annotation.MyAutowired;
import com.wpz.common.spring.controller.UserController;
import com.wpz.common.spring.service.UserService;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class MyTest2 {

    @Test
    public void test() {
        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
        UserService userService = new UserService();

        Stream.of(clazz.getDeclaredFields()).forEach(field -> {
            String name = field.getName();
            MyAutowired annotation = field.getAnnotation(MyAutowired.class);

            if (null != annotation) {
                field.setAccessible(true);
                Class<?> type = field.getType();
                try {
                    Object o = type.newInstance();
                    field.set(userController, o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(userController.getUserService());
    }
}
