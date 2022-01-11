package com.gec.aop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@Component(value = "User")
public class User {
     public void add(){
//         int i = 1/0;
         System.out.println("add");
    }
}
