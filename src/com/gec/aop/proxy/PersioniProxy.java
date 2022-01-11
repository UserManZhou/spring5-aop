package com.gec.aop.proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value = "persionProxy")
@Aspect
@Order(1)
public class PersioniProxy {

    @Pointcut(value = "execution(* com.gec.aop.entity.User.add(..))")
    public void executions(){

    }

    @Before(value = "executions()")
    public void before(){
        System.out.println("person before");
    }

}
