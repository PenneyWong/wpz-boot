package com.wpz.common.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @Autowired
    private Boy boy;

    @Autowired
    private Girl girl;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        Boy boy1 = (Boy)context.getBean("boy");
        boy1.buy("36");

    }
}
