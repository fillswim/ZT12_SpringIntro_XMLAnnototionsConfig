package com.fillswim.spring.Introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Cat implements Pet {

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
