package com.gec.aop.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value = "UserProxy")
@Aspect
@Order(1)
public class UserProxy {

    @Pointcut(value = "execution(* com.gec.aop.entity.User.add(..))")
    public void executions(){

    }

    @Before(value = "executions()")
    public void before(){
        System.out.println("before");
    }

    @After(value = "execution(* com.gec.aop.entity.User.add(..))")
    public void after(){
        System.out.println("after");
    }

    @AfterReturning(value = "execution(* com.gec.aop.entity.User.add(..))")
    public void afterReturning(){
        System.out.println("after afterReturning");
    }


    @AfterThrowing(value = "execution(* com.gec.aop.entity.User.add(..))")
    public void afterThrowing(){
        System.out.println("after afterThrowing");
    }

    @Around(value = "execution(* com.gec.aop.entity.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around  ---之前");

        proceedingJoinPoint.proceed();

        System.out.println("around  ---之后");

    }

}
