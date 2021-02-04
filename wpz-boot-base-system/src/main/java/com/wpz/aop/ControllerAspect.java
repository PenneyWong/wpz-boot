package com.wpz.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ControllerAspect {

    @Pointcut("execution(public String com.wpz.aop.AopController.aopTest(..))")
    public void executeService( ){}

    @Around("executeService()")
    public Object AroundAdvice(ProceedingJoinPoint pjp )  {

        Object[] args = pjp.getArgs();
        try{
            log.info("通知");
            Object obj = pjp.proceed();
            String obj1 = null;
            if("wangpengzhen".equals(args[0])){
                obj1=  (String) obj;
                obj1 = obj1+"改了返回参数";

            }
            log.info("后置通知");
            return (Object) obj1;
        }
        catch (Throwable t){
            t.printStackTrace();
        }
        return null;
    }
}
