package com.fillswim.spring.Introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{

    @Override
    public void say() {
        System.out.println("Bow-Bow");
    }
}
