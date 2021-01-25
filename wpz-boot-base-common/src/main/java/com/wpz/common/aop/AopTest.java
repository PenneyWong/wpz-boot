package com.wpz.common.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class AopTest {

    @Pointcut("execution(public * com.wpz.common.aop.Man.buy(..)) && args(price) &&bean(girl))")
    public void setAdvice(String price) {
    }

    @Around("setAdvice(price)")
    public String aroundAdvice(ProceedingJoinPoint pjp, String price) {

        try {
            pjp.proceed();
            if (Double.parseDouble(price) > 60) {
                System.out.println("女孩买衣服超过了60元，赠送一双袜子");
                return "衣服和袜子";
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return "衣服";
    }
}
