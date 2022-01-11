package com.gec.aop.test;

import com.gec.aop.config.SpringConfig;
import com.gec.aop.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = (User) applicationContext.getBean("User");
        user.add();
    }

    @Test
    public void tes2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        User user = (User) applicationContext.getBean("user");
        user.add();
    }

}
